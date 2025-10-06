package com.sangui.sanguimall.order.service;

import com.sangui.sanguimall.order.entity.PaymentInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 支付信息表(PaymentInfo)表服务接口
 *
 * @author makejava
 * @since 2025-10-04 15:32:01
 */
public interface PaymentInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PaymentInfo queryById(Long id);

    /**
     * 分页查询
     *
     * @param paymentInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PaymentInfo> queryByPage(PaymentInfo paymentInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param paymentInfo 实例对象
     * @return 实例对象
     */
    PaymentInfo insert(PaymentInfo paymentInfo);

    /**
     * 修改数据
     *
     * @param paymentInfo 实例对象
     * @return 实例对象
     */
    PaymentInfo update(PaymentInfo paymentInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
