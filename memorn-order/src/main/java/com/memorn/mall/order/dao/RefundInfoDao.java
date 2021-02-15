package com.memorn.mall.order.dao;

import com.memorn.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author kevin
 * @email sinomorn@gmail.com
 * @date 2021-02-15 15:08:23
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
