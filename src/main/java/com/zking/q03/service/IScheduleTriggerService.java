package com.zking.q03.service;

import com.zking.q03.model.ScheduleTrigger;

public interface IScheduleTriggerService {
    void refreshTrigger();

    void add(ScheduleTrigger scheduleTrigger);
}
