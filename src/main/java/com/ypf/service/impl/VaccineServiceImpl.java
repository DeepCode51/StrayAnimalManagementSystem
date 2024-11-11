package com.ypf.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ypf.mapper.TDogMapper;
import com.ypf.mapper.TDogVaccineMapper;
import com.ypf.mapper.TDogVaccineMapperCustom;
import com.ypf.mapper.TVaccineMapper;
import com.ypf.pojo.TDog;
import com.ypf.pojo.TDogExample;
import com.ypf.pojo.TDogVaccine;
import com.ypf.pojo.TVaccine;
import com.ypf.pojo.TVaccineExample;
import com.ypf.pojo.TDogExample.Criteria;
import com.ypf.service.VaccineService;
import com.ypf.utils.JqGridResult;
import com.ypf.vo.DogVaccineVO;

@Service
public class VaccineServiceImpl implements VaccineService {

	@Autowired
	TVaccineMapper vaccineMapper;
	
	@Autowired
	TDogVaccineMapper dogVaccineMapper;
	
	@Autowired
	TDogMapper dogMapper;
	
	@Autowired
	TDogVaccineMapperCustom dogVaccineMapperCustom;
	
	
	@Override
	public int addVaccine(TVaccine vaccine) {
		int result = vaccineMapper.insert(vaccine);
		return result;
	}

	@Override
	public int deleteVaccine(Integer vaccineId) {
		int result = vaccineMapper.deleteByPrimaryKey(vaccineId);
		return result;
	}

	@Override
	public int updateVaccine(TVaccine vaccine) {
		int result = vaccineMapper.updateByPrimaryKeySelective(vaccine);
		return result;
	}

	@Override
	public JqGridResult queryAllVaccine(TVaccine vaccine,Integer page,Integer pageSize) {
		
		

		TVaccineExample vaccineExample = new TVaccineExample();
		
		PageHelper.startPage(page, pageSize);

		List<TVaccine> list = vaccineMapper.selectByExample(vaccineExample);
		
		PageInfo<TVaccine> pageInfo = new PageInfo<>(list);
		
		JqGridResult grid = new JqGridResult();
		grid.setPage(pageInfo.getPageNum());
		grid.setRows(list);
		grid.setTotal(pageInfo.getPages());
		grid.setRecords(pageInfo.getTotal());
		
		return grid;
	}

	@Override
	public int addDogVaccine(TDogVaccine dogVaccine) {
		dogVaccine.setVaccineTime(new Date());
		dogVaccineMapper.insert(dogVaccine);
		return 0;
	}

	@Override
	public JqGridResult queryDogVaccine(TDogVaccine dogVaccine, Integer page, Integer pageSize) {
		
		PageHelper.startPage(page, pageSize);

		List<DogVaccineVO> list = dogVaccineMapperCustom.queryAllDogVaccineList();
		
		PageInfo<DogVaccineVO> pageInfo = new PageInfo<>(list);
		
		JqGridResult grid = new JqGridResult();
		grid.setPage(pageInfo.getPageNum());
		grid.setRows(list);
		grid.setTotal(pageInfo.getPages());
		grid.setRecords(pageInfo.getTotal());
		
		return grid;
	}

	@Override
	public TVaccine queryVaccineInfoById(Integer vaccineId) {
		TVaccine vaccineInfo = vaccineMapper.selectByPrimaryKey(vaccineId);
		return vaccineInfo;
	}

	@Override
	public TDogVaccine queryDogVaccineInfoById(Integer dogVaccineId) {
		TDogVaccine dogVaccineInfo = dogVaccineMapper.selectByPrimaryKey(dogVaccineId);
		return dogVaccineInfo;
	}


}
