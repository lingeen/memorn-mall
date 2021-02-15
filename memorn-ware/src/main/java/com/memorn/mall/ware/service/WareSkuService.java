package com.memorn.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.memorn.common.utils.PageUtils;
import com.memorn.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author kevin
 * @email sinomorn@gmail.com
 * @date 2021-02-15 15:09:59
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

