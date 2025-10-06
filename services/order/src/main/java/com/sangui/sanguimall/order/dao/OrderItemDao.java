package com.sangui.sanguimall.order.dao;

import com.sangui.sanguimall.order.entity.OrderItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 订单项信息(OrderItem)表数据库访问层
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
public interface OrderItemDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderItem queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param orderItem 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<OrderItem> queryAllByLimit(OrderItem orderItem, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param orderItem 查询条件
     * @return 总行数
     */
    long count(OrderItem orderItem);

    /**
     * 新增数据
     *
     * @param orderItem 实例对象
     * @return 影响行数
     */
    int insert(OrderItem orderItem);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderItem> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OrderItem> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderItem> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OrderItem> entities);

    /**
     * 修改数据
     *
     * @param orderItem 实例对象
     * @return 影响行数
     */
    int update(OrderItem orderItem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

