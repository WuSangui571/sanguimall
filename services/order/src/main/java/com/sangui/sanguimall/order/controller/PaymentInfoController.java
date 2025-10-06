package com.sangui.sanguimall.order.controller;

import com.sangui.sanguimall.order.entity.PaymentInfo;
import com.sangui.sanguimall.order.service.PaymentInfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 支付信息表(PaymentInfo)表控制层
 *
 * @author makejava
 * @since 2025-10-04 15:32:01
 */
@RestController
@RequestMapping("paymentInfo")
public class PaymentInfoController {
    /**
     * 服务对象
     */
    @Resource
    private PaymentInfoService paymentInfoService;

    /**
     * 分页查询
     *
     * @param paymentInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PaymentInfo>> queryByPage(PaymentInfo paymentInfo, PageRequest pageRequest) {
        return ResponseEntity.ok(this.paymentInfoService.queryByPage(paymentInfo, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PaymentInfo> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.paymentInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param paymentInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PaymentInfo> add(PaymentInfo paymentInfo) {
        return ResponseEntity.ok(this.paymentInfoService.insert(paymentInfo));
    }

    /**
     * 编辑数据
     *
     * @param paymentInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PaymentInfo> edit(PaymentInfo paymentInfo) {
        return ResponseEntity.ok(this.paymentInfoService.update(paymentInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.paymentInfoService.deleteById(id));
    }

}

