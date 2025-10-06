package com.sangui.sanguimall.coupon.mapper;

import com.sangui.sanguimall.coupon.model.SmsSeckillSession;

public interface SmsSeckillSessiondao {
    int deleteByPrimaryKey(Long id);

    int insert(SmsSeckillSession record);

    int insertSelective(SmsSeckillSession record);

    SmsSeckillSession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsSeckillSession record);

    int updateByPrimaryKey(SmsSeckillSession record);
}