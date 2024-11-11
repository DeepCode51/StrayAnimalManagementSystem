package com.ypf.mapper;

import java.util.List;

import com.ypf.vo.AdoptRecord;
import com.ypf.vo.AdoptUserVO;

public interface TDogUserMapperCustom {

	public List<AdoptRecord> queryAllAdoptRecordList();
	
	public List<AdoptUserVO> queryAllAdoptUserList();
}