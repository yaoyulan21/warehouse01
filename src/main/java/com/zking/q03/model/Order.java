package com.zking.q03.model;

import java.util.Date;

public class Order {
    private Integer orderId;

    private String orderNo;

    private Integer customerId;

    private Integer orderStatus;

    private Date createTimestamp;

    public Order(Integer orderId, String orderNo, Integer customerId, Integer orderStatus, Date createTimestamp) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.customerId = customerId;
        this.orderStatus = orderStatus;
        this.createTimestamp = createTimestamp;
    }

    public Order() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}