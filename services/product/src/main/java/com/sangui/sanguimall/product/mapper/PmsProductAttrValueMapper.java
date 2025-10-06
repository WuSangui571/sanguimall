package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsProductAttrValue;

public interface PmsProductAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttrValue record);

    int insertSelective(PmsProductAttrValue record);

    PmsProductAttrValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttrValue record);

    int updateByPrimaryKey(PmsProductAttrValue record);
}