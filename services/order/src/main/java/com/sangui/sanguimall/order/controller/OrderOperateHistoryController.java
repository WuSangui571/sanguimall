package com.sangui.sanguimall.order.controller;

import com.sangui.sanguimall.order.entity.OrderOperateHistory;
import com.sangui.sanguimall.order.service.OrderOperateHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单操作历史记录(OrderOperateHistory)表控制层
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
@RestController
@RequestMapping("orderOperateHistory")
public class OrderOperateHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private OrderOperateHistoryService orderOperateHistoryService;

    /**
     * 分页查询
     *
     * @param orderOperateHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OrderOperateHistory>> queryByPage(OrderOperateHistory orderOperateHistory, PageRequest pageRequest) {
        return ResponseEntity.ok(this.orderOperateHistoryService.queryByPage(orderOperateHistory, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OrderOperateHistory> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.orderOperateHistoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param orderOperateHistory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OrderOperateHistory> add(OrderOperateHistory orderOperateHistory) {
        return ResponseEntity.ok(this.orderOperateHistoryService.insert(orderOperateHistory));
    }

    /**
     * 编辑数据
     *
     * @param orderOperateHistory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OrderOperateHistory> edit(OrderOperateHistory orderOperateHistory) {
        return ResponseEntity.ok(this.orderOperateHistoryService.update(orderOperateHistory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.orderOperateHistoryService.deleteById(id));
    }

}

