package com.zking.q03.quartz;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class MyTask3 implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        JobDataMap jobDataMap = jobDetail.getJobDataMap();
        String name = jobDataMap.getString("name");
        String age = jobDataMap.getString("age");
        log.info("MyJob3.execute正在执行，" + new Date().toLocaleString() + ",age=" + age + ",name=" + name);

    }
}
