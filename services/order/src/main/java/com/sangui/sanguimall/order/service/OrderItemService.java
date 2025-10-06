package com.sangui.sanguimall.order.service;

import com.sangui.sanguimall.order.entity.OrderItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 订单项信息(OrderItem)表服务接口
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
public interface OrderItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderItem queryById(Long id);

    /**
     * 分页查询
     *
     * @param orderItem 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OrderItem> queryByPage(OrderItem orderItem, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param orderItem 实例对象
     * @return 实例对象
     */
    OrderItem insert(OrderItem orderItem);

    /**
     * 修改数据
     *
     * @param orderItem 实例对象
     * @return 实例对象
     */
    OrderItem update(OrderItem orderItem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
