package com.sangui.sanguimall.ware.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 商品库存
 * wms_ware_sku
 */
@Data
public class WmsWareSku implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * 仓库id
     */
    private Long wareId;

    /**
     * 库存数
     */
    private Integer stock;

    /**
     * sku_name
     */
    private String skuName;

    /**
     * 锁定库存
     */
    private Integer stockLocked;

    private static final long serialVersionUID = 1L;
}