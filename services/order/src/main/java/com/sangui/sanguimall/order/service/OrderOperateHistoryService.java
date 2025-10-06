package com.sangui.sanguimall.order.service;

import com.sangui.sanguimall.order.entity.OrderOperateHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 订单操作历史记录(OrderOperateHistory)表服务接口
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
public interface OrderOperateHistoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderOperateHistory queryById(Long id);

    /**
     * 分页查询
     *
     * @param orderOperateHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OrderOperateHistory> queryByPage(OrderOperateHistory orderOperateHistory, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param orderOperateHistory 实例对象
     * @return 实例对象
     */
    OrderOperateHistory insert(OrderOperateHistory orderOperateHistory);

    /**
     * 修改数据
     *
     * @param orderOperateHistory 实例对象
     * @return 实例对象
     */
    OrderOperateHistory update(OrderOperateHistory orderOperateHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
