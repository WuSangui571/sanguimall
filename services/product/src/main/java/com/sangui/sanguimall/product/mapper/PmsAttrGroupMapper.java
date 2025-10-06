package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsAttrGroup;

public interface PmsAttrGroupMapper {
    int deleteByPrimaryKey(Long attrGroupId);

    int insert(PmsAttrGroup record);

    int insertSelective(PmsAttrGroup record);

    PmsAttrGroup selectByPrimaryKey(Long attrGroupId);

    int updateByPrimaryKeySelective(PmsAttrGroup record);

    int updateByPrimaryKey(PmsAttrGroup record);
}