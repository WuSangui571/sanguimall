package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsHomeAdv;

public interface SmsHomeAdvdao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeAdv record);

    int insertSelective(SmsHomeAdv record);

    SmsHomeAdv selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeAdv record);

    int updateByPrimaryKey(SmsHomeAdv record);
}