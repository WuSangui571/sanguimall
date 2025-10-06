package com.sangui.sanguimall.order.mapper;

import com.sangui.sanguimall.order.model.OmsPaymentInfo;

public interface OmsPaymentInfoDao {
    int deleteByPrimaryKey(Long id);

    int insert(OmsPaymentInfo record);

    int insertSelective(OmsPaymentInfo record);

    OmsPaymentInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsPaymentInfo record);

    int updateByPrimaryKey(OmsPaymentInfo record);
}