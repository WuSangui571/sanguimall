package com.sangui.sanguimall.order.service.impl;

import com.sangui.sanguimall.order.entity.OrderReturnReason;
import com.sangui.sanguimall.order.dao.OrderReturnReasonDao;
import com.sangui.sanguimall.order.service.OrderReturnReasonService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 退货原因(OrderReturnReason)表服务实现类
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl implements OrderReturnReasonService {
    @Resource
    private OrderReturnReasonDao orderReturnReasonDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderReturnReason queryById(Long id) {
        return this.orderReturnReasonDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param orderReturnReason 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OrderReturnReason> queryByPage(OrderReturnReason orderReturnReason, PageRequest pageRequest) {
        long total = this.orderReturnReasonDao.count(orderReturnReason);
        return new PageImpl<>(this.orderReturnReasonDao.queryAllByLimit(orderReturnReason, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param orderReturnReason 实例对象
     * @return 实例对象
     */
    @Override
    public OrderReturnReason insert(OrderReturnReason orderReturnReason) {
        this.orderReturnReasonDao.insert(orderReturnReason);
        return orderReturnReason;
    }

    /**
     * 修改数据
     *
     * @param orderReturnReason 实例对象
     * @return 实例对象
     */
    @Override
    public OrderReturnReason update(OrderReturnReason orderReturnReason) {
        this.orderReturnReasonDao.update(orderReturnReason);
        return this.queryById(orderReturnReason.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderReturnReasonDao.deleteById(id) > 0;
    }
}
