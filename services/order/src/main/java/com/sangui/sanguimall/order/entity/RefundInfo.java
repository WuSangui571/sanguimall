package com.sangui.sanguimall.order.entity;

import java.io.Serializable;

/**
 * 退款信息(RefundInfo)实体类
 *
 * @author makejava
 * @since 2025-10-04 15:32:01
 */
public class RefundInfo implements Serializable {
    private static final long serialVersionUID = 739004332338677919L;
/**
     * id
     */
    private Long id;
/**
     * 退款的订单
     */
    private Long orderReturnId;
/**
     * 退款金额
     */
    private Double refund;
/**
     * 退款交易流水号
     */
    private String refundSn;
/**
     * 退款状态
     */
    private Integer refundStatus;
/**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    private Integer refundChannel;

    private String refundContent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderReturnId() {
        return orderReturnId;
    }

    public void setOrderReturnId(Long orderReturnId) {
        this.orderReturnId = orderReturnId;
    }

    public Double getRefund() {
        return refund;
    }

    public void setRefund(Double refund) {
        this.refund = refund;
    }

    public String getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Integer getRefundChannel() {
        return refundChannel;
    }

    public void setRefundChannel(Integer refundChannel) {
        this.refundChannel = refundChannel;
    }

    public String getRefundContent() {
        return refundContent;
    }

    public void setRefundContent(String refundContent) {
        this.refundContent = refundContent;
    }

}

