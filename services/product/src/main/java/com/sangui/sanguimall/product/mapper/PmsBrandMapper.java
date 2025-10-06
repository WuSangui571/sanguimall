package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsBrand;

public interface PmsBrandMapper {
    int deleteByPrimaryKey(Long brandId);

    int insert(PmsBrand record);

    int insertSelective(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long brandId);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);
}