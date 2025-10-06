package com.sangui.sanguimall.order.mapper;

import com.sangui.sanguimall.order.model.OmsOrder;

public interface OmsOrderDao {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);
}