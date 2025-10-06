package com.sangui.sanguimall.order.service.impl;

import com.sangui.sanguimall.order.entity.OrderItem;
import com.sangui.sanguimall.order.dao.OrderItemDao;
import com.sangui.sanguimall.order.service.OrderItemService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 订单项信息(OrderItem)表服务实现类
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService {
    @Resource
    private OrderItemDao orderItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderItem queryById(Long id) {
        return this.orderItemDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param orderItem 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OrderItem> queryByPage(OrderItem orderItem, PageRequest pageRequest) {
        long total = this.orderItemDao.count(orderItem);
        return new PageImpl<>(this.orderItemDao.queryAllByLimit(orderItem, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param orderItem 实例对象
     * @return 实例对象
     */
    @Override
    public OrderItem insert(OrderItem orderItem) {
        this.orderItemDao.insert(orderItem);
        return orderItem;
    }

    /**
     * 修改数据
     *
     * @param orderItem 实例对象
     * @return 实例对象
     */
    @Override
    public OrderItem update(OrderItem orderItem) {
        this.orderItemDao.update(orderItem);
        return this.queryById(orderItem.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderItemDao.deleteById(id) > 0;
    }
}
