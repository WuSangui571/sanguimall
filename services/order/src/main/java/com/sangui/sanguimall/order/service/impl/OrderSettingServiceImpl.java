package com.sangui.sanguimall.order.service.impl;

import com.sangui.sanguimall.order.entity.OrderSetting;
import com.sangui.sanguimall.order.dao.OrderSettingDao;
import com.sangui.sanguimall.order.service.OrderSettingService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 订单配置信息(OrderSetting)表服务实现类
 *
 * @author makejava
 * @since 2025-10-04 15:32:01
 */
@Service("orderSettingService")
public class OrderSettingServiceImpl implements OrderSettingService {
    @Resource
    private OrderSettingDao orderSettingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderSetting queryById(Long id) {
        return this.orderSettingDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param orderSetting 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OrderSetting> queryByPage(OrderSetting orderSetting, PageRequest pageRequest) {
        long total = this.orderSettingDao.count(orderSetting);
        return new PageImpl<>(this.orderSettingDao.queryAllByLimit(orderSetting, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param orderSetting 实例对象
     * @return 实例对象
     */
    @Override
    public OrderSetting insert(OrderSetting orderSetting) {
        this.orderSettingDao.insert(orderSetting);
        return orderSetting;
    }

    /**
     * 修改数据
     *
     * @param orderSetting 实例对象
     * @return 实例对象
     */
    @Override
    public OrderSetting update(OrderSetting orderSetting) {
        this.orderSettingDao.update(orderSetting);
        return this.queryById(orderSetting.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderSettingDao.deleteById(id) > 0;
    }
}
