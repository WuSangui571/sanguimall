package com.sangui.sanguimall.ware.dao;

import com.sangui.sanguimall.ware.model.WmsWareOrderTask;

public interface WmsWareOrderTaskDao {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareOrderTask record);

    int insertSelective(WmsWareOrderTask record);

    WmsWareOrderTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareOrderTask record);

    int updateByPrimaryKey(WmsWareOrderTask record);
}