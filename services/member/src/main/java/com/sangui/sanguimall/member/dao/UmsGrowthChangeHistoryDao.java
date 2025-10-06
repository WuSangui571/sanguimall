package com.sangui.sanguimall.member.mapper;

import com.sangui.sanguimall.member.model.UmsGrowthChangeHistory;

public interface UmsGrowthChangeHistoryDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsGrowthChangeHistory record);

    int insertSelective(UmsGrowthChangeHistory record);

    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsGrowthChangeHistory record);

    int updateByPrimaryKey(UmsGrowthChangeHistory record);
}