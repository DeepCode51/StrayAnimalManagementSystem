package com.ypf.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.ypf.pojo.TAdmin;

/**
 * @Description: basic controller, controller中的大部分通用方法写在此
 */
public class BaseController {
		
	/**
	 * 默认分页行数
	 */
	public static final Integer pageSize = 10;
	
	/**
	 * 
	 * @Description: 验证并且获得获得bean上的错误
	 * @param result
	 * @return
	 */
	protected Map<String, String> getErrors(BindingResult result) {
		Map<String, String> map = new HashMap<String, String>();
		List<FieldError> list = result.getFieldErrors();
		for (FieldError error : list) {
			map.put(error.getField(), error.getDefaultMessage());
		}
		return map;
	}
	
	/**
	 * 
	 * @Description: 获得域名地址路径
	 * @param request
	 * @return
	 */
	protected String getWebUrlAddress(HttpServletRequest request) {
		StringBuffer url = request.getRequestURL();  
		String tempContextUrl = url.delete(url.length() - request.getRequestURI().length(), url.length()).append("/").toString();  
		return tempContextUrl;
	}
	
	protected TAdmin getCurrentUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		TAdmin admin = (TAdmin) session.getAttribute("sessionAdmin");
		return admin;
	}
}
