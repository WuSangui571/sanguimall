package com.sangui.sanguimall.order.controller;

import com.sangui.sanguimall.order.entity.OrderReturnApply;
import com.sangui.sanguimall.order.service.OrderReturnApplyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单退货申请(OrderReturnApply)表控制层
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
@RestController
@RequestMapping("orderReturnApply")
public class OrderReturnApplyController {
    /**
     * 服务对象
     */
    @Resource
    private OrderReturnApplyService orderReturnApplyService;

    /**
     * 分页查询
     *
     * @param orderReturnApply 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OrderReturnApply>> queryByPage(OrderReturnApply orderReturnApply, PageRequest pageRequest) {
        return ResponseEntity.ok(this.orderReturnApplyService.queryByPage(orderReturnApply, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OrderReturnApply> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.orderReturnApplyService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param orderReturnApply 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OrderReturnApply> add(OrderReturnApply orderReturnApply) {
        return ResponseEntity.ok(this.orderReturnApplyService.insert(orderReturnApply));
    }

    /**
     * 编辑数据
     *
     * @param orderReturnApply 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OrderReturnApply> edit(OrderReturnApply orderReturnApply) {
        return ResponseEntity.ok(this.orderReturnApplyService.update(orderReturnApply));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.orderReturnApplyService.deleteById(id));
    }

}

