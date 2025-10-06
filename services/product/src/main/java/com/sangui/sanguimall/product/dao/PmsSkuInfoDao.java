package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsSkuInfo;

public interface PmsSkuInfoDao {
    int deleteByPrimaryKey(Long skuId);

    int insert(PmsSkuInfo record);

    int insertSelective(PmsSkuInfo record);

    PmsSkuInfo selectByPrimaryKey(Long skuId);

    int updateByPrimaryKeySelective(PmsSkuInfo record);

    int updateByPrimaryKey(PmsSkuInfo record);
}