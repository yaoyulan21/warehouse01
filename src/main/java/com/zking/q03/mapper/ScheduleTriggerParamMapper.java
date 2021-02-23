package com.zking.q03.mapper;

import com.zking.q03.model.ScheduleTriggerParam;

import java.util.List;

public interface ScheduleTriggerParamMapper {
    int deleteByPrimaryKey(Integer paramId);

    int insert(ScheduleTriggerParam record);

    int insertSelective(ScheduleTriggerParam record);

    ScheduleTriggerParam selectByPrimaryKey(Integer paramId);

    int updateByPrimaryKeySelective(ScheduleTriggerParam record);

    int updateByPrimaryKey(ScheduleTriggerParam record);

    List<ScheduleTriggerParam> listByScheduleTriggerId(Integer scheduleTriggerId);
}