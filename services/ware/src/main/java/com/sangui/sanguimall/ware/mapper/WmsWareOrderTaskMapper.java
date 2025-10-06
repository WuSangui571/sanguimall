package com.sangui.sanguimall.ware.mapper;

import com.sangui.sanguimall.ware.model.WmsWareOrderTask;

public interface WmsWareOrderTaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareOrderTask record);

    int insertSelective(WmsWareOrderTask record);

    WmsWareOrderTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareOrderTask record);

    int updateByPrimaryKey(WmsWareOrderTask record);
}