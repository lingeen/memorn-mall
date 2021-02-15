package com.memorn.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.memorn.common.utils.PageUtils;
import com.memorn.mall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author kevin
 * @email sinomorn@gmail.com
 * @date 2021-02-15 15:07:02
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

