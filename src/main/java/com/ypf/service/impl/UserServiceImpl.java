package com.ypf.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ypf.mapper.TAdminMapper;
import com.ypf.mapper.TUserMapper;
import com.ypf.pojo.TAdmin;
import com.ypf.pojo.TAdminExample;
import com.ypf.pojo.TUser;
import com.ypf.pojo.TUserExample;
import com.ypf.pojo.TUserExample.Criteria;
import com.ypf.service.UserService;
import com.ypf.utils.JqGridResult;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	TUserMapper userMapper;
	
	@Autowired
	TAdminMapper adminMapper;
	
	@Override
	public int addUser(TUser user) {
		int result = userMapper.insert(user);
		return result;
	}

	@Override
	public int deleteUser(Integer userId) {
		int result = userMapper.deleteByPrimaryKey(userId);
		return result;
	}

	@Override
	public int updateUser(TUser user) {
		int result = userMapper.updateByPrimaryKeySelective(user);
		return result;
	}

	@Override
	public JqGridResult queryAllUser(TUser user,Integer page,Integer pageSize) {
		
		String username = "";
		if (user != null) {
			username = user.getUsername();
		}
		
		TUserExample userExample = new TUserExample();
		Criteria userCriteria = userExample.createCriteria();
		if (StringUtils.isNotBlank(username)) {
			userCriteria.andUsernameLike("%" + username + "%");
		}
		
		PageHelper.startPage(page, pageSize);
		
		List<TUser> list = userMapper.selectByExample(userExample);
		
		PageInfo<TUser> pageInfo = new PageInfo<>(list);
		
		JqGridResult grid = new JqGridResult();
		grid.setPage(pageInfo.getPageNum());
		grid.setRows(list);
		grid.setTotal(pageInfo.getPages());
		grid.setRecords(pageInfo.getTotal());
		
		return grid;
	}

	@Override
	public TUser queryUserInfoById(Integer userId) {
		TUser userInfo = userMapper.selectByPrimaryKey(userId);
		return userInfo;
	}

	@Override
	public TAdmin queryAdminByUsernameAndPassword(TAdmin admin) {
		
		if(admin == null){
			return null;
		}
		
		Integer username = admin.getAdminid();
		String password = admin.getPassword();
		
		TAdminExample adminExample = new TAdminExample();
		com.ypf.pojo.TAdminExample.Criteria adminCriteria = adminExample.createCriteria();
		if (username != null && StringUtils.isNotBlank(password)) {
			adminCriteria.andAdminidEqualTo(username);
			adminCriteria.andPasswordEqualTo(password);
		}
		
		List<TAdmin> list = adminMapper.selectByExample(adminExample);
		
		if(list != null && list.size() > 0){
			return list.get(0);
		}else{
			return null;
		}
	}
	
	@Override
	public TUser queryUserByUsernameAndPassword(TUser user) {
		
		if(user == null){
			return null;
		}
		
		String username = user.getUsername();
		String password = user.getPassword();
		
		TUserExample userExample = new TUserExample();
		com.ypf.pojo.TUserExample.Criteria userCriteria = userExample.createCriteria();
		if (username != null && StringUtils.isNotBlank(password)) {
			userCriteria.andUsernameEqualTo(username);
			userCriteria.andPasswordEqualTo(password);
		}
		
		List<TUser> list = userMapper.selectByExample(userExample);
		
		if(list != null && list.size() > 0){
			return list.get(0);
		}else{
			return null;
		}
	}

}
