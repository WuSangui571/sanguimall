package com.sangui.sanguimall.product.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 品牌
 * pms_brand
 */
@Data
public class PmsBrand implements Serializable {
    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 品牌名
     */
    private String name;

    /**
     * 品牌logo地址
     */
    private String logo;

    /**
     * 介绍
     */
    private String descript;

    /**
     * 显示状态[0-不显示；1-显示]
     */
    private Byte showStatus;

    /**
     * 检索首字母
     */
    private String firstLetter;

    /**
     * 排序
     */
    private Integer sort;

    private static final long serialVersionUID = 1L;
}