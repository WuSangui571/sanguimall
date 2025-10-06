package com.sangui.sanguimall.ware.dao;

import com.sangui.sanguimall.ware.model.WmsPurchaseDetail;

public interface WmsPurchaseDetailDao {
    int deleteByPrimaryKey(Long id);

    int insert(WmsPurchaseDetail record);

    int insertSelective(WmsPurchaseDetail record);

    WmsPurchaseDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsPurchaseDetail record);

    int updateByPrimaryKey(WmsPurchaseDetail record);
}