package com.sangui.sanguimall.ware.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 库存工作单
 * wms_ware_order_task_detail
 */
@Data
public class WmsWareOrderTaskDetail implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * sku_name
     */
    private String skuName;

    /**
     * 购买个数
     */
    private Integer skuNum;

    /**
     * 工作单id
     */
    private Long taskId;

    private static final long serialVersionUID = 1L;
}