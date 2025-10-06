package com.sangui.sanguimall.order.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 退货原因(OrderReturnReason)实体类
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
public class OrderReturnReason implements Serializable {
    private static final long serialVersionUID = 914232539833572965L;
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
    private Integer status;
/**
     * create_time
     */
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

