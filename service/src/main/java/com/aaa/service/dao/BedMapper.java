package com.aaa.service.dao;

import com.aaa.service.entity.Bed;

public interface BedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bed record);

    int insertSelective(Bed record);

    Bed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bed record);

    int updateByPrimaryKey(Bed record);
}