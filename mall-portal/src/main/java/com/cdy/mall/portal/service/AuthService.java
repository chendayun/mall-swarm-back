package com.cdy.mall.portal.service;

import com.cdy.mall.common.api.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author CDY
 */
@FeignClient("mall-auth")
public interface AuthService {
    /**
     * token 验证
     *
     * @param parameters parameters
     * @return CommonResult
     */
    @PostMapping(value = "oauth/token")
    CommonResult<?> getAccessToken(@RequestParam Map<String, String> parameters);
}
