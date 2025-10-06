package com.sangui.sanguimall.coupon.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 专题商品
 * sms_home_subject_spu
 */
@Data
public class SmsHomeSubjectSpu implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 专题名字
     */
    private String name;

    /**
     * 专题id
     */
    private Long subjectId;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * 排序
     */
    private Integer sort;

    private static final long serialVersionUID = 1L;
}