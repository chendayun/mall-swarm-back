package com.cdy.mall.common.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 登录用户信息
 *
 * @author CDY
 */

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class UserDto {
    private Long id;

    private String username;

    private String password;

    private Integer status;

    private String clientId;

    private List<String> roles;

}
