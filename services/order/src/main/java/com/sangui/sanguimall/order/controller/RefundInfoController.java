package com.sangui.sanguimall.order.controller;

import com.sangui.sanguimall.order.entity.RefundInfo;
import com.sangui.sanguimall.order.service.RefundInfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 退款信息(RefundInfo)表控制层
 *
 * @author makejava
 * @since 2025-10-04 15:32:01
 */
@RestController
@RequestMapping("refundInfo")
public class RefundInfoController {
    /**
     * 服务对象
     */
    @Resource
    private RefundInfoService refundInfoService;

    /**
     * 分页查询
     *
     * @param refundInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<RefundInfo>> queryByPage(RefundInfo refundInfo, PageRequest pageRequest) {
        return ResponseEntity.ok(this.refundInfoService.queryByPage(refundInfo, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<RefundInfo> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.refundInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param refundInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<RefundInfo> add(RefundInfo refundInfo) {
        return ResponseEntity.ok(this.refundInfoService.insert(refundInfo));
    }

    /**
     * 编辑数据
     *
     * @param refundInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<RefundInfo> edit(RefundInfo refundInfo) {
        return ResponseEntity.ok(this.refundInfoService.update(refundInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.refundInfoService.deleteById(id));
    }

}

