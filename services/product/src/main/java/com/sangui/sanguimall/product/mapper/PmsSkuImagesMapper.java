package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsSkuImages;

public interface PmsSkuImagesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuImages record);

    int insertSelective(PmsSkuImages record);

    PmsSkuImages selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSkuImages record);

    int updateByPrimaryKey(PmsSkuImages record);
}