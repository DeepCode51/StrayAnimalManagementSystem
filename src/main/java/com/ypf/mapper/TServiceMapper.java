package com.ypf.mapper;

import com.ypf.pojo.TService;
import com.ypf.pojo.TServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TServiceMapper {
    int countByExample(TServiceExample example);

    int deleteByExample(TServiceExample example);

    int deleteByPrimaryKey(String servicename);

    int insert(TService record);

    int insertSelective(TService record);

    List<TService> selectByExample(TServiceExample example);

    TService selectByPrimaryKey(String servicename);

    int updateByExampleSelective(@Param("record") TService record, @Param("example") TServiceExample example);

    int updateByExample(@Param("record") TService record, @Param("example") TServiceExample example);

    int updateByPrimaryKeySelective(TService record);

    int updateByPrimaryKey(TService record);
}