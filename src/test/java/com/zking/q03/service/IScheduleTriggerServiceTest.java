package com.zking.q03.service;

import com.zking.q03.BaseTest;
import com.zking.q03.model.ScheduleTrigger;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import static org.junit.Assert.*;


public class IScheduleTriggerServiceTest extends BaseTest {

    @Autowired
    private IScheduleTriggerService scheduleTriggerService;

    private ScheduleTrigger scheduleTrigger;

    @Before
    public void setUp() throws Exception {
        scheduleTrigger = new ScheduleTrigger();
    }

    @Test
    public void add() throws Exception {
        scheduleTrigger.setId(null);
        scheduleTrigger.setCron("*/30 * * * * ?");
        scheduleTrigger.setStatus("1");

        scheduleTrigger.setJobName("com.zking.q03.quartz.MyTask1");
        scheduleTrigger.setJobGroup("group1");
        scheduleTriggerService.add(scheduleTrigger);

    }

    @Test
    public void add2() throws Exception {
        scheduleTrigger.setId(null);
        scheduleTrigger.setCron("*/3 * * * * ?");
        scheduleTrigger.setStatus("1");

        scheduleTrigger.setJobName("com.zking.q03.quartz.MyTask2");
        scheduleTrigger.setJobGroup("group2-" + System.currentTimeMillis());
        scheduleTriggerService.add(scheduleTrigger);
    }

    @Test
    public void add3() throws Exception {
        scheduleTrigger.setId(null);
        scheduleTrigger.setCron("*/10 * * * * ?");
        scheduleTrigger.setStatus("1");
        scheduleTrigger.setJobName("com.zking.q03.quartz.MyTask3");
        scheduleTrigger.setJobGroup("group-3");

        //动态添加任务的参数
        scheduleTriggerService.add(scheduleTrigger);
    }


}