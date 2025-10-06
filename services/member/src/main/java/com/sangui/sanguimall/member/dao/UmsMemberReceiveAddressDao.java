package com.sangui.sanguimall.member.mapper;

import com.sangui.sanguimall.member.model.UmsMemberReceiveAddress;

public interface UmsMemberReceiveAddressDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    int insertSelective(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    int updateByPrimaryKey(UmsMemberReceiveAddress record);
}