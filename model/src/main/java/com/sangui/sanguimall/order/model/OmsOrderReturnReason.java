package com.sangui.sanguimall.order.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 退货原因
 * oms_order_return_reason
 */
@Data
public class OmsOrderReturnReason implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 退货原因名
     */
    private String name;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 启用状态
     */
    private Boolean status;

    /**
     * create_time
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}