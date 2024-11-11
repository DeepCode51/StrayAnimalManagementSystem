package com.ypf.service;

import com.ypf.pojo.TAdmin;
import com.ypf.pojo.TUser;
import com.ypf.utils.JqGridResult;


public interface UserService {

	public int addUser(TUser user);
	
	public int deleteUser(Integer userId);
	
	public int updateUser(TUser user);
	
	public JqGridResult queryAllUser(TUser user,Integer page,Integer pageSize);

	public TUser queryUserInfoById(Integer userId);
	
	/**
	 * 后台根据账号和密码查询管理员
	 * @param admin
	 * @return
	 */
	public TAdmin queryAdminByUsernameAndPassword(TAdmin admin);
	
	/**
	 * 前台根据账号和密码查询用户
	 * @param user
	 * @return
	 */
	public TUser queryUserByUsernameAndPassword(TUser user);
}
