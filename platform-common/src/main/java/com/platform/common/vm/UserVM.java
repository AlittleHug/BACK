package com.platform.common.vm;

/**
 * 用户VM
 */
public class UserVM {

    /**
     * 登录用户名
     */
    private String userName;
    /**
     * 登录密码
     */
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public UserVM setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public UserVM setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    @Override
    public String toString() {
        return "UserVM{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
