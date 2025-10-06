package com.sangui.sanguimall.coupon.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 秒杀活动商品关联
 * sms_seckill_sku_relation
 */
@Data
public class SmsSeckillSkuRelation implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 活动id
     */
    private Long promotionId;

    /**
     * 活动场次id
     */
    private Long promotionSessionId;

    /**
     * 商品id
     */
    private Long skuId;

    /**
     * 秒杀价格
     */
    private Long seckillPrice;

    /**
     * 秒杀总量
     */
    private Long seckillCount;

    /**
     * 每人限购数量
     */
    private Long seckillLimit;

    /**
     * 排序
     */
    private Integer seckillSort;

    private static final long serialVersionUID = 1L;
}