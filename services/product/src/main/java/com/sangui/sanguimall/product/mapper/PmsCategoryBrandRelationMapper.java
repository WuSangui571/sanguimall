package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsCategoryBrandRelation;

public interface PmsCategoryBrandRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsCategoryBrandRelation record);

    int insertSelective(PmsCategoryBrandRelation record);

    PmsCategoryBrandRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsCategoryBrandRelation record);

    int updateByPrimaryKey(PmsCategoryBrandRelation record);
}