package com.sangui.sanguimall.order.mapper;

import com.sangui.sanguimall.order.model.OmsOrderOperateHistory;

public interface OmsOrderOperateHistoryDao {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderOperateHistory record);

    int insertSelective(OmsOrderOperateHistory record);

    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    int updateByPrimaryKey(OmsOrderOperateHistory record);
}