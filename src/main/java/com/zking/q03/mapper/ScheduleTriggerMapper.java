package com.zking.q03.mapper;

import com.zking.q03.model.ScheduleTrigger;

import java.util.List;

public interface ScheduleTriggerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScheduleTrigger record);

    int insertSelective(ScheduleTrigger record);

    ScheduleTrigger selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ScheduleTrigger record);

    int updateByPrimaryKey(ScheduleTrigger record);

    List<ScheduleTrigger> queryAll();
}