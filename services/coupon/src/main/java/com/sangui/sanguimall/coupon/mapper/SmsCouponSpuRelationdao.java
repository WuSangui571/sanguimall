package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsCouponSpuRelation;

public interface SmsCouponSpuRelationdao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponSpuRelation record);

    int insertSelective(SmsCouponSpuRelation record);

    SmsCouponSpuRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponSpuRelation record);

    int updateByPrimaryKey(SmsCouponSpuRelation record);
}