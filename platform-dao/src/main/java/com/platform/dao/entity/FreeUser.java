/* https://github.com/orange1438 */
package com.platform.dao.entity;

import java.io.Serializable;

/** 
 * @author zhimin_hou
 * date:2019/05/08 11:34
 */
public class FreeUser implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 5383224424344726119L;

    /**
	 *  属性:  用户id
	*/
    private Integer userid;

    /**
	 *  属性:  用户名
	*/
    private String username;

    /**
	 *  属性:  用户密码
	*/
    private String userpassword;

    /**
	 *  属性:  用户级别
	*/
    private Integer userlevel;

    /**
	 *  属性:  用户头像地址
	*/
    private String userhead;

    /**
	 *  属性:  用户登录次数
	*/
    private Integer loginnumber;

    /**
	 *  属性:  用户状态： 0-正常；1-禁用
	*/
    private Integer userstatus;

    /**
	 *  属性:  备注
	*/
    private String remark;

    /** 
     * 获取 用户id freeuser.userId
     * @return 用户id
     */
    public final Integer getUserid() {
        return userid;
    }

    /** 
     * 设置 用户id freeuser.userId
     * @param userid 用户id
     */
    public final void setUserid(Integer userid) {
        this.userid = userid;
    }

    /** 
     * 获取 用户名 freeuser.userName
     * @return 用户名
     */
    public final String getUsername() {
        return username;
    }

    /** 
     * 设置 用户名 freeuser.userName
     * @param username 用户名
     */
    public final void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /** 
     * 获取 用户密码 freeuser.userPassword
     * @return 用户密码
     */
    public final String getUserpassword() {
        return userpassword;
    }

    /** 
     * 设置 用户密码 freeuser.userPassword
     * @param userpassword 用户密码
     */
    public final void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    /** 
     * 获取 用户级别 freeuser.userLevel
     * @return 用户级别
     */
    public final Integer getUserlevel() {
        return userlevel;
    }

    /** 
     * 设置 用户级别 freeuser.userLevel
     * @param userlevel 用户级别
     */
    public final void setUserlevel(Integer userlevel) {
        this.userlevel = userlevel;
    }

    /** 
     * 获取 用户头像地址 freeuser.userHead
     * @return 用户头像地址
     */
    public final String getUserhead() {
        return userhead;
    }

    /** 
     * 设置 用户头像地址 freeuser.userHead
     * @param userhead 用户头像地址
     */
    public final void setUserhead(String userhead) {
        this.userhead = userhead == null ? null : userhead.trim();
    }

    /** 
     * 获取 用户登录次数 freeuser.loginNumber
     * @return 用户登录次数
     */
    public final Integer getLoginnumber() {
        return loginnumber;
    }

    /** 
     * 设置 用户登录次数 freeuser.loginNumber
     * @param loginnumber 用户登录次数
     */
    public final void setLoginnumber(Integer loginnumber) {
        this.loginnumber = loginnumber;
    }

    /** 
     * 获取 用户状态： 0-正常；1-禁用 freeuser.userStatus
     * @return 用户状态： 0-正常；1-禁用
     */
    public final Integer getUserstatus() {
        return userstatus;
    }

    /** 
     * 设置 用户状态： 0-正常；1-禁用 freeuser.userStatus
     * @param userstatus 用户状态： 0-正常；1-禁用
     */
    public final void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }

    /** 
     * 获取 备注 freeuser.remark
     * @return 备注
     */
    public final String getRemark() {
        return remark;
    }

    /** 
     * 设置 备注 freeuser.remark
     * @param remark 备注
     */
    public final void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", userpassword=").append(userpassword);
        sb.append(", userlevel=").append(userlevel);
        sb.append(", userhead=").append(userhead);
        sb.append(", loginnumber=").append(loginnumber);
        sb.append(", userstatus=").append(userstatus);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}