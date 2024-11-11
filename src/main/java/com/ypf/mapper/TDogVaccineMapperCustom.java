package com.ypf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ypf.pojo.TVaccine;
import com.ypf.vo.DogVaccineVO;


public interface TDogVaccineMapperCustom {

	/**
	 * 查询狗的接种疫苗信息
	 * @return
	 */
	public List<DogVaccineVO> queryAllDogVaccineList();
	
	/**
	 * 查询每个狗对应的接种疫苗名称
	 * @param dogId
	 * @return
	 */
	public List<TVaccine> queryAllDogOfVaccineNameList(@Param(value="dogId") Integer dogId);
}