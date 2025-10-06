package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsMemberPrice;

public interface SmsMemberPricedao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsMemberPrice record);

    int insertSelective(SmsMemberPrice record);

    SmsMemberPrice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsMemberPrice record);

    int updateByPrimaryKey(SmsMemberPrice record);
}