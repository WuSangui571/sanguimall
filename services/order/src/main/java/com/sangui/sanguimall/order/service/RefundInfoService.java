package com.sangui.sanguimall.order.service;

import com.sangui.sanguimall.order.entity.RefundInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 退款信息(RefundInfo)表服务接口
 *
 * @author makejava
 * @since 2025-10-04 15:32:01
 */
public interface RefundInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RefundInfo queryById(Long id);

    /**
     * 分页查询
     *
     * @param refundInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<RefundInfo> queryByPage(RefundInfo refundInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param refundInfo 实例对象
     * @return 实例对象
     */
    RefundInfo insert(RefundInfo refundInfo);

    /**
     * 修改数据
     *
     * @param refundInfo 实例对象
     * @return 实例对象
     */
    RefundInfo update(RefundInfo refundInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
