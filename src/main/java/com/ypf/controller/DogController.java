package com.ypf.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ypf.pojo.TDog;
import com.ypf.pojo.TDogUser;
import com.ypf.pojo.TUser;
import com.ypf.service.AdoptService;
import com.ypf.service.DogService;
import com.ypf.utils.AdoptJSONResult;
import com.ypf.utils.JqGridResult;

@Controller
@RequestMapping("/dog")
public class DogController extends BaseController{

	@Autowired
	private DogService dogService;
	
	@Autowired
	private AdoptService adoptService;
	
	@RequestMapping("/showDogInfoListPage")
	public String showDogInfoListPage(){
		return "/dog/dogInfoList";
	}
	
	@RequestMapping("/showCreateDogPage")
	public ModelAndView showCreateDogPage(HttpServletRequest request){
		
		ModelAndView mv = new ModelAndView("dog/createDog");
		return mv;
	}
	
	@RequestMapping("/getDogInfoList")
	@ResponseBody
	public JqGridResult getDogInfoList(TDog dog,Integer page){
		if(page == null){
			page = 1;
		}
		JqGridResult jqGridResult = dogService.queryAllDog(dog, page, pageSize);
		return jqGridResult;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public AdoptJSONResult deleteDog(Integer dogId){
		 dogService.deleteDog(dogId);
		 return AdoptJSONResult.ok();
	}
	
	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	public AdoptJSONResult saveOrUpdate(TDog dog,@RequestParam(name="file",required=false) MultipartFile file,
			HttpServletRequest request) throws IOException{
		
		// 狗id不为空，则修改狗；狗id为空，则新建狗
		Integer dogId = dog.getId();
		if (dogId != null) {
			dogService.updateDog(dog);
		} else {
			if(file != null){
				//保存到数据库的路径
				String temp=Thread.currentThread().getContextClassLoader().getResource("").getPath(); 
				int num=temp.indexOf(".metadata");
				String path=temp.substring(1,num).replace('/', '\\')+request.getContextPath().replaceAll("/", "")+"\\src\\main\\webapp\\";
				String uploadDB = "static\\pages\\img\\dog\\";
				String fileName = file.getOriginalFilename();
				String[] fileNames = fileName.split("\\.");	
				String sufixName = fileNames[fileNames.length-1]; 
				fileName = new Date().getTime() + "." +sufixName;
				uploadDB += fileName;
				dog.setFaceImage(uploadDB);
				
				InputStream in = file.getInputStream();
				File finalFile = new File(path+uploadDB);
				OutputStream os = new FileOutputStream(finalFile);
				IOUtils.copy(in, os);
			}
			
			dogService.addDog(dog);
		}		
		return AdoptJSONResult.ok();
	}
	
	@RequestMapping("/saveAdoptUserInfo")
	public String saveOrUpdate(TDog dog,HttpServletRequest request) throws IOException{
		
		HttpSession session = request.getSession();
		
		dogService.addDog(dog);
		int dogId = dog.getId();
		
		TDogUser adopt = new TDogUser();
		
		TUser user = (TUser) session.getAttribute("sessionUser");
		adopt.setUserId(user.getId());
		//type 1:收养  2:送养
		adopt.setType(2);
		adopt.setStatus(0);
		adopt.setDogId(dogId);
		adoptService.addAdoptRecord(adopt);
		return "forward:/frontPage/adoptDog.jsp";
	}
	
	
	@RequestMapping("/showModifyDogPage")
	public ModelAndView showModifyDog(Integer dogId, HttpServletRequest request){
		
		// 查询狗信息
		TDog dogInfo = dogService.queryDogInfoById(dogId);
		
		ModelAndView mv = new ModelAndView("dog/modifyDog");
		mv.addObject("dogInfo", dogInfo);
		
		return mv;
	}
	
	@PostMapping("/upload")
	@ResponseBody
	public AdoptJSONResult faceUpload(MultipartFile file,HttpServletRequest request)throws Exception{
		
		//保存到数据库中的相对路径
 		String uploadPathDB = "static\\pages\\img\\dog\\";
		try {
			if(file != null){
				//保存到数据库的路径
				String temp=Thread.currentThread().getContextClassLoader().getResource("").getPath(); 
				int num=temp.indexOf(".metadata");
				String path=temp.substring(1,num).replace('/', '\\')+request.getContextPath().replaceAll("/", "")+"\\src\\main\\webapp\\";
				String fileName = file.getOriginalFilename();
				String[] fileNames = fileName.split("\\.");	
				String sufixName = fileNames[fileNames.length-1]; 
				fileName = new Date().getTime() + "." +sufixName;
				uploadPathDB += fileName;
				
				InputStream in = file.getInputStream();
				File finalFile = new File(path+uploadPathDB);
				OutputStream os = new FileOutputStream(finalFile);
				IOUtils.copy(in, os);
			}else{
				return AdoptJSONResult.errorMsg("上传出错...");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return AdoptJSONResult.errorMsg("上传出错...");
		}  
		
		return AdoptJSONResult.ok(uploadPathDB);
	}
}
