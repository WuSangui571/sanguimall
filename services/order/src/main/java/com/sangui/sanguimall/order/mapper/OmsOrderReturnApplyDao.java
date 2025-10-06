package com.sangui.sanguimall.order.mapper;

import com.sangui.sanguimall.order.model.OmsOrderReturnApply;

public interface OmsOrderReturnApplyDao {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnApply record);

    int insertSelective(OmsOrderReturnApply record);

    OmsOrderReturnApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderReturnApply record);

    int updateByPrimaryKey(OmsOrderReturnApply record);
}