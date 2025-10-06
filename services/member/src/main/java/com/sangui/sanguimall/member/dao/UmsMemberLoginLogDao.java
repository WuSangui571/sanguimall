package com.sangui.sanguimall.member.mapper;

import com.sangui.sanguimall.member.model.UmsMemberLoginLog;

public interface UmsMemberLoginLogDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLoginLog record);

    int insertSelective(UmsMemberLoginLog record);

    UmsMemberLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLoginLog record);

    int updateByPrimaryKey(UmsMemberLoginLog record);
}