package com.memorn.mall.coupon.dao;

import com.memorn.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author kevin
 * @email sinomorn@gmail.com
 * @date 2021-02-15 14:59:37
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
