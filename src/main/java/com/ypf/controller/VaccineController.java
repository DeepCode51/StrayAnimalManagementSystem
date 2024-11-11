package com.ypf.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ypf.pojo.TDog;
import com.ypf.pojo.TDogVaccine;
import com.ypf.pojo.TVaccine;
import com.ypf.service.DogService;
import com.ypf.service.VaccineService;
import com.ypf.utils.AdoptJSONResult;
import com.ypf.utils.JqGridResult;

/**
 * 疫苗管理Controller
 * @author 11023
 *
 */
@Controller
@RequestMapping("/vaccine")
public class VaccineController extends BaseController{

	@Autowired
	private VaccineService vaccineService;
	
	@Autowired
	private DogService dogService;
	
	@RequestMapping("/showVaccineInfoListPage")
	public String showVaccineInfoListPage(){
		return "/vaccine/vaccineInfoList";
	}
	
	@RequestMapping("/showDogVaccineInfoListPage")
	public String showDogVaccineInfoListPage(){
		return "/vaccine/dogVaccineInfoList";
	}
	
	@RequestMapping("/showCreateVaccinePage")
	public ModelAndView showCreateVaccinePage(HttpServletRequest request){
		
		ModelAndView mv = new ModelAndView("vaccine/createVaccine");
		return mv;
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public AdoptJSONResult deleteVaccine(Integer vaccineId){
		 vaccineService.deleteVaccine(vaccineId);
		 return AdoptJSONResult.ok();
	}
	
	@RequestMapping("/getVaccineInfoList")
	@ResponseBody
	public JqGridResult getVaccineInfoList(TVaccine vaccine,Integer page){
		 if(page == null){
			 page = 1;
		 }
		 JqGridResult jqGridResult = vaccineService.queryAllVaccine(vaccine, page, pageSize);
		 return jqGridResult;
	}
	
	@RequestMapping("/getDogVaccineInfoList")
	@ResponseBody
	public JqGridResult getDogVaccineInfoList(TDogVaccine dogVaccine,Integer page){
		 if(page == null){
			 page = 1;
		 }
		 JqGridResult jqGridResult = vaccineService.queryDogVaccine(dogVaccine, page, pageSize);
		 return jqGridResult;
	}

	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	public AdoptJSONResult saveOrUpdate(TVaccine vaccine){
		
		Integer vaccineId = vaccine.getId();
		if (vaccineId != null) {
			vaccineService.updateVaccine(vaccine);
		} else {
			vaccineService.addVaccine(vaccine);
		}		
		return AdoptJSONResult.ok();
	}
	
	@RequestMapping("/modifyVaccine")
	public ModelAndView showModifyUser(Integer vaccineId, HttpServletRequest request){
		
		// 查询疫苗信息
		TVaccine vaccineInfo = vaccineService.queryVaccineInfoById(vaccineId);
		
		ModelAndView mv = new ModelAndView("vaccine/modifyVaccine");
		mv.addObject("vaccineInfo", vaccineInfo);
		
		return mv;
	}
	
	
	@RequestMapping("/modifyDogVaccine")
	public ModelAndView modifyDogVaccine(Integer dogId, HttpServletRequest request){
		
		// 查询流浪狗接种疫苗信息
		TDog dogInfo = dogService.queryDogInfoById(dogId);
		
		ModelAndView mv = new ModelAndView("vaccine/modifyDogVaccine");
		mv.addObject("dogInfo", dogInfo);
		
		//查询疫苗信息
		JqGridResult jqGridResult = vaccineService.queryAllVaccine(null, 1, pageSize);
		List<TVaccine> vaccineInfoList = (List<TVaccine>) jqGridResult.getRows();
		mv.addObject("vaccineInfoList", vaccineInfoList);
		
		return mv;
	}
	
	/**
	 * 保存接种疫苗记录
	 * @param dogVaccine
	 * @return
	 */
	@RequestMapping("/saveDogVaccine")
	@ResponseBody
	public AdoptJSONResult saveDogVaccine(TDogVaccine dogVaccine){
		
		//改变是否接种疫苗状态
		Integer dogId = dogVaccine.getDogId();
		TDog dog = dogService.queryDogInfoById(dogId);
		dog.setVaccinationStatus(2);
		dogService.updateDog(dog);
		
		//接种疫苗 相应的疫苗库存 -1
		Integer vaccineId = dogVaccine.getVaccineId();
		TVaccine vaccine = vaccineService.queryVaccineInfoById(vaccineId);
		vaccine.setVaccineCount(vaccine.getVaccineCount()-1);
		vaccineService.updateVaccine(vaccine);
		
		//添加接种记录
		vaccineService.addDogVaccine(dogVaccine); 	
		return AdoptJSONResult.ok();
	}
}
