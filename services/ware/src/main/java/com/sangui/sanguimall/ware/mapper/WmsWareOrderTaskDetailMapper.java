package com.sangui.sanguimall.ware.mapper;

import com.sangui.sanguimall.ware.model.WmsWareOrderTaskDetail;

public interface WmsWareOrderTaskDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareOrderTaskDetail record);

    int insertSelective(WmsWareOrderTaskDetail record);

    WmsWareOrderTaskDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareOrderTaskDetail record);

    int updateByPrimaryKey(WmsWareOrderTaskDetail record);
}