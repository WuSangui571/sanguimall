package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsHomeSubjectSpu;

public interface SmsHomeSubjectSpudao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeSubjectSpu record);

    int insertSelective(SmsHomeSubjectSpu record);

    SmsHomeSubjectSpu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeSubjectSpu record);

    int updateByPrimaryKey(SmsHomeSubjectSpu record);
}