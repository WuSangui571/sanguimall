package com.sangui.sanguimall.member.mapper;

import com.sangui.sanguimall.member.model.UmsMemberLevel;

public interface UmsMemberLevelDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    int insertSelective(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLevel record);

    int updateByPrimaryKey(UmsMemberLevel record);
}