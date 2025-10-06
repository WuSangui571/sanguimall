package com.sangui.sanguimall.product.model;

import java.io.Serializable;
import lombok.Data;

/**
 * spu图片
 * pms_spu_images
 */
@Data
public class PmsSpuImages implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * 图片名
     */
    private String imgName;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 顺序
     */
    private Integer imgSort;

    /**
     * 是否默认图
     */
    private Byte defaultImg;

    private static final long serialVersionUID = 1L;
}