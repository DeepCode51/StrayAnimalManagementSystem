package com.ypf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ypf.pojo.TDogUser;
import com.ypf.pojo.TUser;
import com.ypf.service.AdoptService;
import com.ypf.utils.AdoptJSONResult;
import com.ypf.utils.JqGridResult;

@Controller
@RequestMapping("/adopt")
public class AdoptController extends BaseController{

	@Autowired
	private AdoptService adoptService;
	
	@RequestMapping("/showAdoptRecordInfoListPage")
	public String showUserInfoListPage(){
		return "/record/adoptRecordInfoList";
	}

	@RequestMapping("/showAdoptUserInfoPage")
	public String showAdoptUserInfoPage(){
		return "/record/adoptUserInfoList";
	}
	
	@RequestMapping("/getAdoptRecordInfoList")
	@ResponseBody
	public JqGridResult getAdoptRecordInfoList(TUser user,Integer page){
		 if(page == null){
			 page = 1;
		 }
		 JqGridResult jqGridResult = adoptService.queryAllAdoptRecord(page,pageSize);
		 return jqGridResult;
	}
	
	@RequestMapping("/getAdoptUserInfoList")
	@ResponseBody
	public JqGridResult getAdoptUserInfoList(TUser user,Integer page){
		 if(page == null){
			 page = 1;
		 }
		 JqGridResult jqGridResult = adoptService.queryAllAdoptUser(page, pageSize);
		 return jqGridResult;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public AdoptJSONResult deleteComment(Integer recordId){
		 adoptService.deleteAdoptRecord(recordId);
		 return AdoptJSONResult.ok();
	}
	
	@RequestMapping("/modifyAdoptRecord")
	@ResponseBody
	public AdoptJSONResult modifyAdoptRecord(TDogUser adoptRecord){
		//修改 status 0:未审核   1:审核通过
		adoptRecord.setStatus(1);
		adoptService.updateAdoptRecord(adoptRecord);
		return AdoptJSONResult.ok();
	}
}
