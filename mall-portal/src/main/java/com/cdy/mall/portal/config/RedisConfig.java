package com.cdy.mall.portal.config;

import com.cdy.mall.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/** Redis相关配置
 * @author CDY
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {
}
