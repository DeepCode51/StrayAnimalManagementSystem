package com.ypf.mapper;

import com.ypf.pojo.TDogVaccine;
import com.ypf.pojo.TDogVaccineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDogVaccineMapper {
    int countByExample(TDogVaccineExample example);

    int deleteByExample(TDogVaccineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDogVaccine record);

    int insertSelective(TDogVaccine record);

    List<TDogVaccine> selectByExample(TDogVaccineExample example);

    TDogVaccine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDogVaccine record, @Param("example") TDogVaccineExample example);

    int updateByExample(@Param("record") TDogVaccine record, @Param("example") TDogVaccineExample example);

    int updateByPrimaryKeySelective(TDogVaccine record);

    int updateByPrimaryKey(TDogVaccine record);
}