package com.sangui.sanguimall.order.mapper;

import com.sangui.sanguimall.order.model.OmsOrderReturnReason;

public interface OmsOrderReturnReasonDao {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnReason record);

    int insertSelective(OmsOrderReturnReason record);

    OmsOrderReturnReason selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderReturnReason record);

    int updateByPrimaryKey(OmsOrderReturnReason record);
}