package com.sangui.sanguimall.order.controller;

import com.sangui.sanguimall.order.entity.OrderSetting;
import com.sangui.sanguimall.order.service.OrderSettingService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单配置信息(OrderSetting)表控制层
 *
 * @author makejava
 * @since 2025-10-04 15:32:00
 */
@RestController
@RequestMapping("orderSetting")
public class OrderSettingController {
    /**
     * 服务对象
     */
    @Resource
    private OrderSettingService orderSettingService;

    /**
     * 分页查询
     *
     * @param orderSetting 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OrderSetting>> queryByPage(OrderSetting orderSetting, PageRequest pageRequest) {
        return ResponseEntity.ok(this.orderSettingService.queryByPage(orderSetting, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OrderSetting> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.orderSettingService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param orderSetting 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OrderSetting> add(OrderSetting orderSetting) {
        return ResponseEntity.ok(this.orderSettingService.insert(orderSetting));
    }

    /**
     * 编辑数据
     *
     * @param orderSetting 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OrderSetting> edit(OrderSetting orderSetting) {
        return ResponseEntity.ok(this.orderSettingService.update(orderSetting));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.orderSettingService.deleteById(id));
    }

}

