package com.memorn.mall.member.feign;

import com.memorn.common.utils.PageUtils;
import com.memorn.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("memorn-coupon")
public interface CouponFeign {

    @RequestMapping("/coupon/coupon/list")
    R list(@RequestParam Map<String, Object> params);

}
