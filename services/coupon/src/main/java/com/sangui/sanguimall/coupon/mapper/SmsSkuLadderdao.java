package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsSkuLadder;

public interface SmsSkuLadderdao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsSkuLadder record);

    int insertSelective(SmsSkuLadder record);

    SmsSkuLadder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsSkuLadder record);

    int updateByPrimaryKey(SmsSkuLadder record);
}