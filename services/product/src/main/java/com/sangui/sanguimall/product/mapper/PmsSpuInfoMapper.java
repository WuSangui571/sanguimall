package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsSpuInfo;

public interface PmsSpuInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSpuInfo record);

    int insertSelective(PmsSpuInfo record);

    PmsSpuInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSpuInfo record);

    int updateByPrimaryKey(PmsSpuInfo record);
}