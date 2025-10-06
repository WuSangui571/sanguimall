package com.sangui.sanguimall.member.mapper;

import com.sangui.sanguimall.member.model.UmsIntegrationChangeHistory;

public interface UmsIntegrationChangeHistoryDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationChangeHistory record);

    int insertSelective(UmsIntegrationChangeHistory record);

    UmsIntegrationChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record);

    int updateByPrimaryKey(UmsIntegrationChangeHistory record);
}