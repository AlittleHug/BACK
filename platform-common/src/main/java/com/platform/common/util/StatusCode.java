package com.platform.common.util;

import javax.security.auth.login.LoginException;

/**
 * 状态码
 */
public enum StatusCode {
    OK(100,"成功"),
    Failed(101,"失败"),
    LoginSuccess(200,"登录成功"),
    LoginFailed(201,"用户名或密码不正确!"),
    LoginError(202,"用户不存在"),
    LoginException(203,"登录异常，请联系管理员！");

    private final int value;
    private final String reasonPhrase;

    private StatusCode(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public int getValue() {
        return value;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }
}
