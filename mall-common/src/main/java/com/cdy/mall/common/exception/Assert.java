package com.cdy.mall.common.exception;

import com.cdy.mall.common.api.IErrorCode;

/**
 * @author CDY
 */
public class Assert {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
