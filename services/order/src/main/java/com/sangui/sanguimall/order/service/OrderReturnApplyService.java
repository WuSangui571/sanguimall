package com.sangui.sanguimall.order.service;

import com.sangui.sanguimall.order.entity.OrderReturnApply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 订单退货申请(OrderReturnApply)表服务接口
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
public interface OrderReturnApplyService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderReturnApply queryById(Long id);

    /**
     * 分页查询
     *
     * @param orderReturnApply 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OrderReturnApply> queryByPage(OrderReturnApply orderReturnApply, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param orderReturnApply 实例对象
     * @return 实例对象
     */
    OrderReturnApply insert(OrderReturnApply orderReturnApply);

    /**
     * 修改数据
     *
     * @param orderReturnApply 实例对象
     * @return 实例对象
     */
    OrderReturnApply update(OrderReturnApply orderReturnApply);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
