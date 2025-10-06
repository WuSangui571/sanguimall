package com.sangui.sanguimall.order.dao;

import com.sangui.sanguimall.order.entity.OrderReturnApply;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 订单退货申请(OrderReturnApply)表数据库访问层
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
public interface OrderReturnApplyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderReturnApply queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param orderReturnApply 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<OrderReturnApply> queryAllByLimit(OrderReturnApply orderReturnApply, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param orderReturnApply 查询条件
     * @return 总行数
     */
    long count(OrderReturnApply orderReturnApply);

    /**
     * 新增数据
     *
     * @param orderReturnApply 实例对象
     * @return 影响行数
     */
    int insert(OrderReturnApply orderReturnApply);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderReturnApply> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OrderReturnApply> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderReturnApply> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OrderReturnApply> entities);

    /**
     * 修改数据
     *
     * @param orderReturnApply 实例对象
     * @return 影响行数
     */
    int update(OrderReturnApply orderReturnApply);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

