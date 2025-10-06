package com.sangui.sanguimall.order.controller;

import com.sangui.sanguimall.order.entity.OrderReturnReason;
import com.sangui.sanguimall.order.service.OrderReturnReasonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 退货原因(OrderReturnReason)表控制层
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
@RestController
@RequestMapping("orderReturnReason")
public class OrderReturnReasonController {
    /**
     * 服务对象
     */
    @Resource
    private OrderReturnReasonService orderReturnReasonService;

    /**
     * 分页查询
     *
     * @param orderReturnReason 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OrderReturnReason>> queryByPage(OrderReturnReason orderReturnReason, PageRequest pageRequest) {
        return ResponseEntity.ok(this.orderReturnReasonService.queryByPage(orderReturnReason, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OrderReturnReason> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.orderReturnReasonService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param orderReturnReason 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OrderReturnReason> add(OrderReturnReason orderReturnReason) {
        return ResponseEntity.ok(this.orderReturnReasonService.insert(orderReturnReason));
    }

    /**
     * 编辑数据
     *
     * @param orderReturnReason 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OrderReturnReason> edit(OrderReturnReason orderReturnReason) {
        return ResponseEntity.ok(this.orderReturnReasonService.update(orderReturnReason));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.orderReturnReasonService.deleteById(id));
    }

}

