package com.sangui.sanguimall.order.controller;

import com.sangui.sanguimall.order.entity.OrderItem;
import com.sangui.sanguimall.order.service.OrderItemService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单项信息(OrderItem)表控制层
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
@RestController
@RequestMapping("orderItem")
public class OrderItemController {
    /**
     * 服务对象
     */
    @Resource
    private OrderItemService orderItemService;

    /**
     * 分页查询
     *
     * @param orderItem 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OrderItem>> queryByPage(OrderItem orderItem, PageRequest pageRequest) {
        return ResponseEntity.ok(this.orderItemService.queryByPage(orderItem, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OrderItem> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.orderItemService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param orderItem 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OrderItem> add(OrderItem orderItem) {
        return ResponseEntity.ok(this.orderItemService.insert(orderItem));
    }

    /**
     * 编辑数据
     *
     * @param orderItem 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OrderItem> edit(OrderItem orderItem) {
        return ResponseEntity.ok(this.orderItemService.update(orderItem));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.orderItemService.deleteById(id));
    }

}

