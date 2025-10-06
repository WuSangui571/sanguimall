package com.sangui.sanguimall.coupon.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 优惠券与产品关联
 * sms_coupon_spu_relation
 */
@Data
public class SmsCouponSpuRelation implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 优惠券id
     */
    private Long couponId;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * spu_name
     */
    private String spuName;

    private static final long serialVersionUID = 1L;
}