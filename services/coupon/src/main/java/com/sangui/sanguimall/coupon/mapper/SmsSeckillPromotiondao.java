package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsSeckillPromotion;

public interface SmsSeckillPromotiondao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsSeckillPromotion record);

    int insertSelective(SmsSeckillPromotion record);

    SmsSeckillPromotion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsSeckillPromotion record);

    int updateByPrimaryKey(SmsSeckillPromotion record);
}