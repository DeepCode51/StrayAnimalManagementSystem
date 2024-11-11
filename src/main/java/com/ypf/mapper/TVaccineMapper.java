package com.ypf.mapper;

import com.ypf.pojo.TVaccine;
import com.ypf.pojo.TVaccineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVaccineMapper {
    int countByExample(TVaccineExample example);

    int deleteByExample(TVaccineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TVaccine record);

    int insertSelective(TVaccine record);

    List<TVaccine> selectByExample(TVaccineExample example);

    TVaccine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TVaccine record, @Param("example") TVaccineExample example);

    int updateByExample(@Param("record") TVaccine record, @Param("example") TVaccineExample example);

    int updateByPrimaryKeySelective(TVaccine record);

    int updateByPrimaryKey(TVaccine record);
}