package com.cdy.mall.common.annotation;

import java.lang.annotation.*;

/**
 * @author CDY
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CacheException {
}
