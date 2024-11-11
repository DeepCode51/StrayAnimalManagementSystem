package com.ypf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ypf.mapper.TDogUserMapper;
import com.ypf.mapper.TDogUserMapperCustom;
import com.ypf.pojo.TDogUser;
import com.ypf.service.AdoptService;
import com.ypf.utils.JqGridResult;
import com.ypf.vo.AdoptRecord;
import com.ypf.vo.AdoptUserVO;

@Service
public class AdoptServiceImpl implements AdoptService {

	@Autowired
	TDogUserMapper adoptMapper;
	
	@Autowired
	TDogUserMapperCustom adoptRecordMapper;
	
	@Override
	public int addAdoptRecord(TDogUser adopt) {
		int result = adoptMapper.insert(adopt);
		return result;
	}

	@Override
	public int deleteAdoptRecord(Integer adoptId) {
		int result = adoptMapper.deleteByPrimaryKey(adoptId);
		return result;
	}

	@Override
	public int updateAdoptRecord(TDogUser adopt) {
		int result = adoptMapper.updateByPrimaryKeySelective(adopt);
		return result;
	}

	@Override
	public JqGridResult queryAllAdoptRecord(Integer page,Integer pageSize) {
		
		PageHelper.startPage(page, pageSize);
		
		List<AdoptRecord> list = adoptRecordMapper.queryAllAdoptRecordList();
		
		PageInfo<AdoptRecord> pageInfo = new PageInfo<>(list);
		
		JqGridResult grid = new JqGridResult();
		grid.setPage(pageInfo.getPageNum());
		grid.setRows(list);
		grid.setTotal(pageInfo.getPages());
		grid.setRecords(pageInfo.getTotal());
		
		return grid;
	}
	
	@Override
	public JqGridResult queryAllAdoptUser(Integer page,Integer pageSize) {
		
		PageHelper.startPage(page, pageSize);
		
		List<AdoptUserVO> list = adoptRecordMapper.queryAllAdoptUserList();
		
		PageInfo<AdoptUserVO> pageInfo = new PageInfo<>(list);
		
		JqGridResult grid = new JqGridResult();
		grid.setPage(pageInfo.getPageNum());
		grid.setRows(list);
		grid.setTotal(pageInfo.getPages());
		grid.setRecords(pageInfo.getTotal());
		
		return grid;
	}
}
