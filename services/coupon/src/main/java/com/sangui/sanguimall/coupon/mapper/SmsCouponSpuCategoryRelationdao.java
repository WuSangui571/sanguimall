package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsCouponSpuCategoryRelation;

public interface SmsCouponSpuCategoryRelationdao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponSpuCategoryRelation record);

    int insertSelective(SmsCouponSpuCategoryRelation record);

    SmsCouponSpuCategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponSpuCategoryRelation record);

    int updateByPrimaryKey(SmsCouponSpuCategoryRelation record);
}