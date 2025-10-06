package com.sangui.sanguimall.ware.mapper;

import com.sangui.sanguimall.ware.model.WmsWareInfo;

public interface WmsWareInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareInfo record);

    int insertSelective(WmsWareInfo record);

    WmsWareInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareInfo record);

    int updateByPrimaryKey(WmsWareInfo record);
}