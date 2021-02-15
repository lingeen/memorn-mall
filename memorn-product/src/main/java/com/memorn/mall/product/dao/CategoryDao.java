package com.memorn.mall.product.dao;

import com.memorn.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kevin
 * @email sinomorn@gmail.com
 * @date 2021-02-15 14:48:02
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
