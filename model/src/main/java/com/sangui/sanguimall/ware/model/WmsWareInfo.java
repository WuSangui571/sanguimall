package com.sangui.sanguimall.ware.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 仓库信息
 * wms_ware_info
 */
@Data
public class WmsWareInfo implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 仓库名
     */
    private String name;

    /**
     * 仓库地址
     */
    private String address;

    /**
     * 区域编码
     */
    private String areacode;

    private static final long serialVersionUID = 1L;
}