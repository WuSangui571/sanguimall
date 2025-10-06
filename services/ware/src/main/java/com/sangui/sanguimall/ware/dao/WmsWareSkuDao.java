package com.sangui.sanguimall.ware.dao;

import com.sangui.sanguimall.ware.model.WmsWareSku;

public interface WmsWareSkuDao {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareSku record);

    int insertSelective(WmsWareSku record);

    WmsWareSku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareSku record);

    int updateByPrimaryKey(WmsWareSku record);
}