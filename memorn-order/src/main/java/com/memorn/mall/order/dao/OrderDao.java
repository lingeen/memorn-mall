package com.memorn.mall.order.dao;

import com.memorn.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author kevin
 * @email sinomorn@gmail.com
 * @date 2021-02-15 15:08:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
