package com.sangui.sanguimall.ware.mapper;

import com.sangui.sanguimall.ware.model.WmsPurchase;

public interface WmsPurchaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsPurchase record);

    int insertSelective(WmsPurchase record);

    WmsPurchase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsPurchase record);

    int updateByPrimaryKey(WmsPurchase record);
}