package com.memorn.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.memorn.common.utils.PageUtils;
import com.memorn.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author kevin
 * @email sinomorn@gmail.com
 * @date 2021-02-15 15:07:02
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

