package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsCategory;

public interface PmsCategoryMapper {
    int deleteByPrimaryKey(Long catId);

    int insert(PmsCategory record);

    int insertSelective(PmsCategory record);

    PmsCategory selectByPrimaryKey(Long catId);

    int updateByPrimaryKeySelective(PmsCategory record);

    int updateByPrimaryKey(PmsCategory record);
}