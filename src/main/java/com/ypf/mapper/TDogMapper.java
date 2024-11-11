package com.ypf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ypf.pojo.TDog;
import com.ypf.pojo.TDogExample;

public interface TDogMapper {
    int countByExample(TDogExample example);

    int deleteByExample(TDogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDog record);

    int insertSelective(TDog record);

    List<TDog> selectByExample(TDogExample example);

    TDog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDog record, @Param("example") TDogExample example);

    int updateByExample(@Param("record") TDog record, @Param("example") TDogExample example);

    int updateByPrimaryKeySelective(TDog record);

    int updateByPrimaryKey(TDog record);
}