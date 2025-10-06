package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsSeckillSkuRelation;

public interface SmsSeckillSkuRelationdao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsSeckillSkuRelation record);

    int insertSelective(SmsSeckillSkuRelation record);

    SmsSeckillSkuRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsSeckillSkuRelation record);

    int updateByPrimaryKey(SmsSeckillSkuRelation record);
}