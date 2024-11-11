package com.ypf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ypf.service.UserService;
import com.ypf.utils.NumberUtil;

@Controller
public class CenterController extends BaseController {
	
	final static Logger log = LoggerFactory.getLogger(CenterController.class);
	
	@Autowired
	private UserService userService;
	
	/*@Autowired
	private ItzixiCaptcha itzixiCaptcha;*/
	
	@RequestMapping("/center")
	public ModelAndView center() {
    	ModelAndView modelAndView = new ModelAndView("center");
		return modelAndView;
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
    	ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	@GetMapping("/login")
	public String login() {
		return "/login";
	}
	
	/*@GetMapping("captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) {
        itzixiCaptcha.generate(request, response);
    }*/
	
    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
    	request.getSession().removeAttribute("sessionUser");
        return "redirect:/login.action";
    }
    
    
}
