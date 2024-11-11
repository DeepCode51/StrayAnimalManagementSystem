package com.ypf.service;

import java.util.List;

import com.ypf.pojo.TDogVaccine;
import com.ypf.pojo.TVaccine;
import com.ypf.utils.JqGridResult;

public interface VaccineService {
	
    public int addVaccine(TVaccine vaccine);
	
	public int deleteVaccine(Integer vaccineId);
	
	public int updateVaccine(TVaccine vaccine);
	
	public JqGridResult queryAllVaccine(TVaccine vaccine,Integer page,Integer pageSize);
	
	public TVaccine queryVaccineInfoById(Integer vaccineId);
	
	/**
	 * 查询接种疫苗记录
	 * @param dogVaccineId
	 * @return
	 */
	public TDogVaccine queryDogVaccineInfoById(Integer dogVaccineId);

	/**
	 * 添加接种记录
	 * @return
	 */
	public int addDogVaccine(TDogVaccine dogVaccine);
	
	/**
	 * 查询接种记录
	 */
	public JqGridResult queryDogVaccine(TDogVaccine dogVaccine,Integer page,Integer pageSize);
}
