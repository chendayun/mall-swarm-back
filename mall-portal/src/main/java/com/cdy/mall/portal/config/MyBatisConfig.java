package com.cdy.mall.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author CDY
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.cdy.mall.mapper", "com.cdy.mall.portal.dao"})
public class MyBatisConfig {
}
