package com.ypf.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ypf.pojo.TAdmin;
import com.ypf.pojo.TDogUser;
import com.ypf.pojo.TUser;
import com.ypf.service.AdoptService;
import com.ypf.service.UserService;
import com.ypf.utils.AdoptJSONResult;
import com.ypf.utils.JqGridResult;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	final static Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AdoptService adoptService;
	
	@RequestMapping("/showUserInfoListPage")
	public String showUserInfoListPage(){
		return "/user/userInfoList";
	}
	
	@RequestMapping("/showCreateUserPage")
	public ModelAndView showCreateUserPage(HttpServletRequest request){
		
		ModelAndView mv = new ModelAndView("user/createUser");
		return mv;
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public AdoptJSONResult deleteUser(Integer userId){
		 userService.deleteUser(userId);
		 return AdoptJSONResult.ok();
	}
	
	@RequestMapping("/getUserInfoList")
	@ResponseBody
	public JqGridResult getUserInfoList(TUser user,Integer page){
		 if(page == null){
			 page = 1;
		 }
		 JqGridResult jqGridResult = userService.queryAllUser(user, page, pageSize);
		 return jqGridResult;
	}

	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	public AdoptJSONResult saveOrUpdate(TUser user){
		
		// 用户id不为空，则修改用户；用户id为空，则新建用户
		Integer userId = user.getId();
		if (userId != null) {
			userService.updateUser(user);
		} else {
			userService.addUser(user);
		}		
		return AdoptJSONResult.ok();
	}
	
	@RequestMapping("/modifyUser")
	public ModelAndView showModifyUser(Integer userId, HttpServletRequest request){
		
		// 查询用户个人信息
		TUser userInfo = userService.queryUserInfoById(userId);
		
		ModelAndView mv = new ModelAndView("user/modifyUser");
		mv.addObject("userInfo", userInfo);
		
		return mv;
	}
	
	/**
	 * 管理员登陆
	 * @param username
	 * @param password
	 * @param request
	 * @return
	 */
	@PostMapping("/login")
	@ResponseBody
	public AdoptJSONResult userLogin(String username, String password,
			HttpServletRequest request) {
		
		if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
			return AdoptJSONResult.errorMap("用户名和密码不能为空");
		} else {
			
			TAdmin admin = new TAdmin(Integer.parseInt(username), password);
			TAdmin currentAdmin =userService.queryAdminByUsernameAndPassword(admin);
			if(currentAdmin != null){
				request.getSession().setAttribute("sessionAdmin", currentAdmin);
				return AdoptJSONResult.ok();
			}else{
				return AdoptJSONResult.errorMsg("登陆失败，请重试...");
			}
		}
		
	}
	
	/**
	 * 用户登陆
	 * @param username
	 * @param password
	 * @param request
	 * @return
	 */
	@PostMapping("/customLogin")
	@ResponseBody
	public AdoptJSONResult customLogin(String username, String password,
			HttpServletRequest request) {
		
		if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
			return AdoptJSONResult.errorMap("用户名和密码不能为空");
		} else {
			TUser user = new TUser(username,password);
			TUser currentUser =userService.queryUserByUsernameAndPassword(user);
			if(currentUser != null){
				request.getSession().setAttribute("sessionUser", currentUser);
				return AdoptJSONResult.ok();
			}else{
				return AdoptJSONResult.errorMsg("登陆失败，请重试...");
			}
		}
		
	}
	
	
	/**
	 * 用户注销
	 * @param username
	 * @param password
	 * @param request
	 * @return
	 */
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/frontPage/login.jsp"; 
	}
	
	/**
	 * 用户收养流浪狗
	 * @param dogId
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@PostMapping("/adoptDog")
	@ResponseBody
	public AdoptJSONResult saveOrUpdate(Integer dogId,HttpServletRequest request) throws IOException{
		
		HttpSession session = request.getSession();
		
		TDogUser adopt = new TDogUser();
		
		
		TUser user = (TUser) session.getAttribute("sessionUser");
		adopt.setUserId(user.getId());
		//type 1:收养  2:送养
		adopt.setType(1);
		adopt.setStatus(0);
		adopt.setDogId(dogId);
		adoptService.addAdoptRecord(adopt);
		
		return AdoptJSONResult.ok();
	}
	
}
