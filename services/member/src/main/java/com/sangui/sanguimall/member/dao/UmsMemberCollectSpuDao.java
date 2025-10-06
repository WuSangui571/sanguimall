package com.sangui.sanguimall.member.mapper;

import com.sangui.sanguimall.member.model.UmsMemberCollectSpu;

public interface UmsMemberCollectSpuDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberCollectSpu record);

    int insertSelective(UmsMemberCollectSpu record);

    UmsMemberCollectSpu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberCollectSpu record);

    int updateByPrimaryKey(UmsMemberCollectSpu record);
}