package com.sangui.sanguimall.coupon.model;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 商品满减信息
 * sms_sku_full_reduction
 */
@Data
public class SmsSkuFullReduction implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * spu_id
     */
    private Long skuId;

    /**
     * 满多少
     */
    private BigDecimal fullPrice;

    /**
     * 减多少
     */
    private BigDecimal reducePrice;

    /**
     * 是否参与其他优惠
     */
    private Boolean addOther;

    private static final long serialVersionUID = 1L;
}