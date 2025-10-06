package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsSpuInfoDesc;

public interface PmsSpuInfoDescDao {
    int deleteByPrimaryKey(Long spuId);

    int insert(PmsSpuInfoDesc record);

    int insertSelective(PmsSpuInfoDesc record);

    PmsSpuInfoDesc selectByPrimaryKey(Long spuId);

    int updateByPrimaryKeySelective(PmsSpuInfoDesc record);

    int updateByPrimaryKey(PmsSpuInfoDesc record);
}