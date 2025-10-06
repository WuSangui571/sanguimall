package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsSpuImages;

public interface PmsSpuImagesDao {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSpuImages record);

    int insertSelective(PmsSpuImages record);

    PmsSpuImages selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSpuImages record);

    int updateByPrimaryKey(PmsSpuImages record);
}