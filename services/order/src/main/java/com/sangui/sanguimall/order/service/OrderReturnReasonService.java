package com.sangui.sanguimall.order.service;

import com.sangui.sanguimall.order.entity.OrderReturnReason;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 退货原因(OrderReturnReason)表服务接口
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
public interface OrderReturnReasonService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderReturnReason queryById(Long id);

    /**
     * 分页查询
     *
     * @param orderReturnReason 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OrderReturnReason> queryByPage(OrderReturnReason orderReturnReason, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param orderReturnReason 实例对象
     * @return 实例对象
     */
    OrderReturnReason insert(OrderReturnReason orderReturnReason);

    /**
     * 修改数据
     *
     * @param orderReturnReason 实例对象
     * @return 实例对象
     */
    OrderReturnReason update(OrderReturnReason orderReturnReason);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
