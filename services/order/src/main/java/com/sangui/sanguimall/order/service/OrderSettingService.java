package com.sangui.sanguimall.order.service;

import com.sangui.sanguimall.order.entity.OrderSetting;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 订单配置信息(OrderSetting)表服务接口
 *
 * @author makejava
 * @since 2025-10-04 15:32:01
 */
public interface OrderSettingService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderSetting queryById(Long id);

    /**
     * 分页查询
     *
     * @param orderSetting 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OrderSetting> queryByPage(OrderSetting orderSetting, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param orderSetting 实例对象
     * @return 实例对象
     */
    OrderSetting insert(OrderSetting orderSetting);

    /**
     * 修改数据
     *
     * @param orderSetting 实例对象
     * @return 实例对象
     */
    OrderSetting update(OrderSetting orderSetting);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
