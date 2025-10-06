package com.sangui.sanguimall.order.service.impl;

import com.sangui.sanguimall.order.entity.RefundInfo;
import com.sangui.sanguimall.order.dao.RefundInfoDao;
import com.sangui.sanguimall.order.service.RefundInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 退款信息(RefundInfo)表服务实现类
 *
 * @author makejava
 * @since 2025-10-04 15:32:01
 */
@Service("refundInfoService")
public class RefundInfoServiceImpl implements RefundInfoService {
    @Resource
    private RefundInfoDao refundInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RefundInfo queryById(Long id) {
        return this.refundInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param refundInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<RefundInfo> queryByPage(RefundInfo refundInfo, PageRequest pageRequest) {
        long total = this.refundInfoDao.count(refundInfo);
        return new PageImpl<>(this.refundInfoDao.queryAllByLimit(refundInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param refundInfo 实例对象
     * @return 实例对象
     */
    @Override
    public RefundInfo insert(RefundInfo refundInfo) {
        this.refundInfoDao.insert(refundInfo);
        return refundInfo;
    }

    /**
     * 修改数据
     *
     * @param refundInfo 实例对象
     * @return 实例对象
     */
    @Override
    public RefundInfo update(RefundInfo refundInfo) {
        this.refundInfoDao.update(refundInfo);
        return this.queryById(refundInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.refundInfoDao.deleteById(id) > 0;
    }
}
