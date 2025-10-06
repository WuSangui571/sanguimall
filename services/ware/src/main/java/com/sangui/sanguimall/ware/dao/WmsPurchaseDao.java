package com.sangui.sanguimall.ware.dao;

import com.sangui.sanguimall.ware.model.WmsPurchase;

public interface WmsPurchaseDao {
    int deleteByPrimaryKey(Long id);

    int insert(WmsPurchase record);

    int insertSelective(WmsPurchase record);

    WmsPurchase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsPurchase record);

    int updateByPrimaryKey(WmsPurchase record);
}