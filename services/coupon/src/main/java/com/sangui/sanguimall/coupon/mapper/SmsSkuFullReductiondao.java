package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsSkuFullReduction;

public interface SmsSkuFullReductiondao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsSkuFullReduction record);

    int insertSelective(SmsSkuFullReduction record);

    SmsSkuFullReduction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsSkuFullReduction record);

    int updateByPrimaryKey(SmsSkuFullReduction record);
}