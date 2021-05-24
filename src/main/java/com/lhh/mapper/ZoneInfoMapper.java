package com.lhh.mapper;


import com.lhh.entity.ZoneInfo;
import com.lhh.entity.ZoneInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZoneInfoMapper {
    int countByExample(ZoneInfoExample example);

    int deleteByExample(ZoneInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZoneInfo record);

    int insertSelective(ZoneInfo record);

    List<ZoneInfo> selectByExample(ZoneInfoExample example);

    ZoneInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZoneInfo record, @Param("example") ZoneInfoExample example);

    int updateByExample(@Param("record") ZoneInfo record, @Param("example") ZoneInfoExample example);

    int updateByPrimaryKeySelective(ZoneInfo record);

    int updateByPrimaryKey(ZoneInfo record);

    List<ZoneInfo> getAll();
}
