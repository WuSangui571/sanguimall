package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsAttrAttrgroupRelation;

public interface PmsAttrAttrgroupRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsAttrAttrgroupRelation record);

    int insertSelective(PmsAttrAttrgroupRelation record);

    PmsAttrAttrgroupRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsAttrAttrgroupRelation record);

    int updateByPrimaryKey(PmsAttrAttrgroupRelation record);
}