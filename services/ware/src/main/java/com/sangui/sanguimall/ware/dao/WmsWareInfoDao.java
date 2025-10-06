package com.sangui.sanguimall.ware.dao;

import com.sangui.sanguimall.ware.model.WmsWareInfo;

public interface WmsWareInfoDao {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareInfo record);

    int insertSelective(WmsWareInfo record);

    WmsWareInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareInfo record);

    int updateByPrimaryKey(WmsWareInfo record);
}