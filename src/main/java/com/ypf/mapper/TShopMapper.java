package com.ypf.mapper;

import com.ypf.pojo.TShop;
import com.ypf.pojo.TShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TShopMapper {
    int countByExample(TShopExample example);

    int deleteByExample(TShopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TShop record);

    int insertSelective(TShop record);

    List<TShop> selectByExample(TShopExample example);

    TShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TShop record, @Param("example") TShopExample example);

    int updateByExample(@Param("record") TShop record, @Param("example") TShopExample example);

    int updateByPrimaryKeySelective(TShop record);

    int updateByPrimaryKey(TShop record);
}