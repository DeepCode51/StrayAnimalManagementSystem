package com.ypf.mapper;

import com.ypf.pojo.TAdmin;
import com.ypf.pojo.TAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAdminMapper {
    int countByExample(TAdminExample example);

    int deleteByExample(TAdminExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(TAdmin record);

    int insertSelective(TAdmin record);

    List<TAdmin> selectByExample(TAdminExample example);

    TAdmin selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(@Param("record") TAdmin record, @Param("example") TAdminExample example);

    int updateByExample(@Param("record") TAdmin record, @Param("example") TAdminExample example);

    int updateByPrimaryKeySelective(TAdmin record);

    int updateByPrimaryKey(TAdmin record);
}