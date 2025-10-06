package com.sangui.sanguimall.coupon.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 优惠券分类关联
 * sms_coupon_spu_category_relation
 */
@Data
public class SmsCouponSpuCategoryRelation implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 优惠券id
     */
    private Long couponId;

    /**
     * 产品分类id
     */
    private Long categoryId;

    /**
     * 产品分类名称
     */
    private String categoryName;

    private static final long serialVersionUID = 1L;
}