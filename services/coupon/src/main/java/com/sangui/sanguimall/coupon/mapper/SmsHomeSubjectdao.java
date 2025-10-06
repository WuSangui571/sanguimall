package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsHomeSubject;

public interface SmsHomeSubjectdao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeSubject record);

    int insertSelective(SmsHomeSubject record);

    SmsHomeSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeSubject record);

    int updateByPrimaryKey(SmsHomeSubject record);
}