package com.sangui.sanguimall.order.service.impl;

import com.sangui.sanguimall.order.entity.OrderOperateHistory;
import com.sangui.sanguimall.order.dao.OrderOperateHistoryDao;
import com.sangui.sanguimall.order.service.OrderOperateHistoryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 订单操作历史记录(OrderOperateHistory)表服务实现类
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl implements OrderOperateHistoryService {
    @Resource
    private OrderOperateHistoryDao orderOperateHistoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderOperateHistory queryById(Long id) {
        return this.orderOperateHistoryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param orderOperateHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OrderOperateHistory> queryByPage(OrderOperateHistory orderOperateHistory, PageRequest pageRequest) {
        long total = this.orderOperateHistoryDao.count(orderOperateHistory);
        return new PageImpl<>(this.orderOperateHistoryDao.queryAllByLimit(orderOperateHistory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param orderOperateHistory 实例对象
     * @return 实例对象
     */
    @Override
    public OrderOperateHistory insert(OrderOperateHistory orderOperateHistory) {
        this.orderOperateHistoryDao.insert(orderOperateHistory);
        return orderOperateHistory;
    }

    /**
     * 修改数据
     *
     * @param orderOperateHistory 实例对象
     * @return 实例对象
     */
    @Override
    public OrderOperateHistory update(OrderOperateHistory orderOperateHistory) {
        this.orderOperateHistoryDao.update(orderOperateHistory);
        return this.queryById(orderOperateHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderOperateHistoryDao.deleteById(id) > 0;
    }
}
