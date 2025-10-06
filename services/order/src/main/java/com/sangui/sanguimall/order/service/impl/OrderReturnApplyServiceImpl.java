package com.sangui.sanguimall.order.service.impl;

import com.sangui.sanguimall.order.entity.OrderReturnApply;
import com.sangui.sanguimall.order.dao.OrderReturnApplyDao;
import com.sangui.sanguimall.order.service.OrderReturnApplyService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 订单退货申请(OrderReturnApply)表服务实现类
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl implements OrderReturnApplyService {
    @Resource
    private OrderReturnApplyDao orderReturnApplyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderReturnApply queryById(Long id) {
        return this.orderReturnApplyDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param orderReturnApply 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OrderReturnApply> queryByPage(OrderReturnApply orderReturnApply, PageRequest pageRequest) {
        long total = this.orderReturnApplyDao.count(orderReturnApply);
        return new PageImpl<>(this.orderReturnApplyDao.queryAllByLimit(orderReturnApply, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param orderReturnApply 实例对象
     * @return 实例对象
     */
    @Override
    public OrderReturnApply insert(OrderReturnApply orderReturnApply) {
        this.orderReturnApplyDao.insert(orderReturnApply);
        return orderReturnApply;
    }

    /**
     * 修改数据
     *
     * @param orderReturnApply 实例对象
     * @return 实例对象
     */
    @Override
    public OrderReturnApply update(OrderReturnApply orderReturnApply) {
        this.orderReturnApplyDao.update(orderReturnApply);
        return this.queryById(orderReturnApply.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderReturnApplyDao.deleteById(id) > 0;
    }
}
