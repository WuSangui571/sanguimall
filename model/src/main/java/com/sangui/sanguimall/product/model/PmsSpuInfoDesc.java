package com.sangui.sanguimall.product.model;

import java.io.Serializable;
import lombok.Data;

/**
 * spu信息介绍
 * pms_spu_info_desc
 */
@Data
public class PmsSpuInfoDesc implements Serializable {
    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 商品介绍
     */
    private String decript;

    private static final long serialVersionUID = 1L;
}