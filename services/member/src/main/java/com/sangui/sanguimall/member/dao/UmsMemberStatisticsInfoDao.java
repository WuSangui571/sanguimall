package com.sangui.sanguimall.member.mapper;

import com.sangui.sanguimall.member.model.UmsMemberStatisticsInfo;

public interface UmsMemberStatisticsInfoDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberStatisticsInfo record);

    int insertSelective(UmsMemberStatisticsInfo record);

    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record);

    int updateByPrimaryKey(UmsMemberStatisticsInfo record);
}