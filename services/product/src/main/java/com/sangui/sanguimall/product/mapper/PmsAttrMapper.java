package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsAttr;

public interface PmsAttrMapper {
    int deleteByPrimaryKey(Long attrId);

    int insert(PmsAttr record);

    int insertSelective(PmsAttr record);

    PmsAttr selectByPrimaryKey(Long attrId);

    int updateByPrimaryKeySelective(PmsAttr record);

    int updateByPrimaryKey(PmsAttr record);
}