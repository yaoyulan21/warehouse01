package com.zking.q03.quartz;

import com.sun.media.jfxmedia.logging.Logger;
import com.zking.q03.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyTask2 extends QuartzJobBean {

    @Autowired
    private IOrderService orderService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        JobDataMap jobDataMap = jobDetail.getJobDataMap();
        Object orderId = jobDataMap.get("orderId");
        log.info("orderId=" + orderId);
        orderService.doCancelOrder();
    }
}
