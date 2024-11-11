package com.ypf.mapper;

import com.ypf.pojo.TDogUser;
import com.ypf.pojo.TDogUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDogUserMapper {
    int countByExample(TDogUserExample example);

    int deleteByExample(TDogUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDogUser record);

    int insertSelective(TDogUser record);

    List<TDogUser> selectByExample(TDogUserExample example);

    TDogUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDogUser record, @Param("example") TDogUserExample example);

    int updateByExample(@Param("record") TDogUser record, @Param("example") TDogUserExample example);

    int updateByPrimaryKeySelective(TDogUser record);

    int updateByPrimaryKey(TDogUser record);
}