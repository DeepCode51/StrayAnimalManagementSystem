package com.ypf.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ypf.mapper.TDogMapper;
import com.ypf.pojo.TDog;
import com.ypf.pojo.TDogExample;
import com.ypf.pojo.TDogExample.Criteria;
import com.ypf.service.DogService;
import com.ypf.utils.JqGridResult;

@Service	
public class DogServiceImpl implements DogService{

	@Autowired
	TDogMapper dogMapper;
	
	@Override
	public int addDog(TDog dog) {
		dog.setAdoptState(1);
		return dogMapper.insert(dog);
	}

	@Override
	public int deleteDog(Integer dogId) {
		int result = dogMapper.deleteByPrimaryKey(dogId);
		return result;
	}

	@Override
	public int updateDog(TDog dog) {
		int result = dogMapper.updateByPrimaryKeySelective(dog);
		return result;
	}

	@Override
	public JqGridResult queryAllDog(TDog dog,Integer page,Integer pageSize) {
		
		String dogName = "";
		if (dog != null) {
			dogName = dog.getDogName();
		}
		
		TDogExample dogExample = new TDogExample();
		Criteria dogCriteria = dogExample.createCriteria();
		if (StringUtils.isNotBlank(dogName)) {
			dogCriteria.andDogNameLike("%" + dogName + "%");
		}
		
		PageHelper.startPage(page, pageSize);
		
		List<TDog> list = dogMapper.selectByExample(dogExample);
		
		PageInfo<TDog> pageInfo = new PageInfo<>(list);
		
		JqGridResult grid = new JqGridResult();
		grid.setPage(pageInfo.getPageNum());
		grid.setRows(list);
		grid.setTotal(pageInfo.getPages());
		grid.setRecords(pageInfo.getTotal());
		
		return grid;
	}

	@Override
	public TDog queryDogInfoById(Integer dogId) {
		TDog dogInfo = dogMapper.selectByPrimaryKey(dogId);
		return dogInfo;
	}
}
