package com.ypf.service;

import com.ypf.pojo.TDog;
import com.ypf.utils.JqGridResult;

public interface DogService {

	public int addDog(TDog dog);
	
	public int deleteDog(Integer dogId);
	
	public int updateDog(TDog dog);
	
	public JqGridResult queryAllDog(TDog dog,Integer page,Integer pageSize);

	public TDog queryDogInfoById(Integer dogId);
}
