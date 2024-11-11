package com.ypf.service;

import com.ypf.pojo.TComment;
import com.ypf.pojo.TDogUser;
import com.ypf.utils.JqGridResult;


public interface AdoptService {

	/**
	 * 添加用户收养记录
	 * @param comment
	 * @return
	 */
	public int addAdoptRecord(TDogUser adopt);
	
	/**
	 * 删除用户收养记录
	 * @param commentId
	 * @return
	 */
	public int deleteAdoptRecord(Integer adoptId);
	
	/**
	 * 更新用户收养记录
	 * @param dogUser
	 * @return
	 */
	public int updateAdoptRecord(TDogUser dogUser);
	
	/**
	 * 查询用户收养记录
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public JqGridResult queryAllAdoptRecord(Integer page,Integer pageSize);

	/**
	 * 查询送养人信息
	 * @param page
	 * @param pageSize
	 * @return
	 */
	JqGridResult queryAllAdoptUser(Integer page, Integer pageSize);

}
