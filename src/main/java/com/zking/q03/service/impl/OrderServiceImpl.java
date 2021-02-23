package com.zking.q03.service.impl;

import com.zking.q03.model.Order;
import com.zking.q03.service.IOrderService;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderServiceImpl implements IOrderService {

    @Override
    public void doCancelOrder() {
        log.info("取消所有付款超时的订单");
    }
}
