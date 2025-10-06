package com.sangui.sanguimall.order.service.impl;

import com.sangui.sanguimall.order.entity.PaymentInfo;
import com.sangui.sanguimall.order.dao.PaymentInfoDao;
import com.sangui.sanguimall.order.service.PaymentInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 支付信息表(PaymentInfo)表服务实现类
 *
 * @author makejava
 * @since 2025-10-04 15:32:01
 */
@Service("paymentInfoService")
public class PaymentInfoServiceImpl implements PaymentInfoService {
    @Resource
    private PaymentInfoDao paymentInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PaymentInfo queryById(Long id) {
        return this.paymentInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param paymentInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PaymentInfo> queryByPage(PaymentInfo paymentInfo, PageRequest pageRequest) {
        long total = this.paymentInfoDao.count(paymentInfo);
        return new PageImpl<>(this.paymentInfoDao.queryAllByLimit(paymentInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param paymentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PaymentInfo insert(PaymentInfo paymentInfo) {
        this.paymentInfoDao.insert(paymentInfo);
        return paymentInfo;
    }

    /**
     * 修改数据
     *
     * @param paymentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PaymentInfo update(PaymentInfo paymentInfo) {
        this.paymentInfoDao.update(paymentInfo);
        return this.queryById(paymentInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.paymentInfoDao.deleteById(id) > 0;
    }
}
