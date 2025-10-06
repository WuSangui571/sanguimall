package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsSpuBounds;

public interface SmsSpuBoundsdao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsSpuBounds record);

    int insertSelective(SmsSpuBounds record);

    SmsSpuBounds selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsSpuBounds record);

    int updateByPrimaryKey(SmsSpuBounds record);
}