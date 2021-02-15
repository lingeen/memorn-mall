package com.memorn.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.memorn.common.utils.PageUtils;
import com.memorn.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author kevin
 * @email sinomorn@gmail.com
 * @date 2021-02-15 14:48:02
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

