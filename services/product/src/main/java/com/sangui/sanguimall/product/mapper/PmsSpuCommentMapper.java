package com.sangui.sanguimall.product.mapper;

import com.sangui.sanguimall.product.model.PmsSpuComment;

public interface PmsSpuCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSpuComment record);

    int insertSelective(PmsSpuComment record);

    PmsSpuComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSpuComment record);

    int updateByPrimaryKey(PmsSpuComment record);
}