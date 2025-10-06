package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsSeckillSkuNotice;

public interface SmsSeckillSkuNoticedao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsSeckillSkuNotice record);

    int insertSelective(SmsSeckillSkuNotice record);

    SmsSeckillSkuNotice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsSeckillSkuNotice record);

    int updateByPrimaryKey(SmsSeckillSkuNotice record);
}