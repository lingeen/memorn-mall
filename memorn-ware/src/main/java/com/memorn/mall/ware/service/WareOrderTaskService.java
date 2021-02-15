package com.memorn.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.memorn.common.utils.PageUtils;
import com.memorn.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author kevin
 * @email sinomorn@gmail.com
 * @date 2021-02-15 15:09:59
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

