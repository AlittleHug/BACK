/* https://github.com/orange1438 */
package com.platform.dao.entity;

import java.io.Serializable;

/** 
 * @author zhimin_hou
 * date:2019/05/08 11:34
 */
public class FreeMenu implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 8829101163867658714L;

    /**
	 *  属性:  菜单id
	*/
    private Integer menuid;

    /**
	 *  属性:  菜单代码
	*/
    private String menucode;

    /**
	 *  属性:  菜单名称
	*/
    private String menuname;

    /**
	 *  属性:  父级菜单代码
	*/
    private String parentmenucode;

    /**
	 *  属性:  菜单级别
	*/
    private Integer menulevel;

    /**
	 *  属性:  菜单点击路径
	*/
    private String menupath;

    /**
	 *  属性:  菜单状态： 0-启用；1-禁用
	*/
    private Integer menustatus;

    /**
	 *  属性:  备注
	*/
    private String remark;

    /** 
     * 获取 菜单id freemenu.menuId
     * @return 菜单id
     */
    public final Integer getMenuid() {
        return menuid;
    }

    /** 
     * 设置 菜单id freemenu.menuId
     * @param menuid 菜单id
     */
    public final void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    /** 
     * 获取 菜单代码 freemenu.menuCode
     * @return 菜单代码
     */
    public final String getMenucode() {
        return menucode;
    }

    /** 
     * 设置 菜单代码 freemenu.menuCode
     * @param menucode 菜单代码
     */
    public final void setMenucode(String menucode) {
        this.menucode = menucode == null ? null : menucode.trim();
    }

    /** 
     * 获取 菜单名称 freemenu.menuName
     * @return 菜单名称
     */
    public final String getMenuname() {
        return menuname;
    }

    /** 
     * 设置 菜单名称 freemenu.menuName
     * @param menuname 菜单名称
     */
    public final void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    /** 
     * 获取 父级菜单代码 freemenu.parentMenuCode
     * @return 父级菜单代码
     */
    public final String getParentmenucode() {
        return parentmenucode;
    }

    /** 
     * 设置 父级菜单代码 freemenu.parentMenuCode
     * @param parentmenucode 父级菜单代码
     */
    public final void setParentmenucode(String parentmenucode) {
        this.parentmenucode = parentmenucode == null ? null : parentmenucode.trim();
    }

    /** 
     * 获取 菜单级别 freemenu.menuLevel
     * @return 菜单级别
     */
    public final Integer getMenulevel() {
        return menulevel;
    }

    /** 
     * 设置 菜单级别 freemenu.menuLevel
     * @param menulevel 菜单级别
     */
    public final void setMenulevel(Integer menulevel) {
        this.menulevel = menulevel;
    }

    /** 
     * 获取 菜单点击路径 freemenu.menuPath
     * @return 菜单点击路径
     */
    public final String getMenupath() {
        return menupath;
    }

    /** 
     * 设置 菜单点击路径 freemenu.menuPath
     * @param menupath 菜单点击路径
     */
    public final void setMenupath(String menupath) {
        this.menupath = menupath == null ? null : menupath.trim();
    }

    /** 
     * 获取 菜单状态： 0-启用；1-禁用 freemenu.menuStatus
     * @return 菜单状态： 0-启用；1-禁用
     */
    public final Integer getMenustatus() {
        return menustatus;
    }

    /** 
     * 设置 菜单状态： 0-启用；1-禁用 freemenu.menuStatus
     * @param menustatus 菜单状态： 0-启用；1-禁用
     */
    public final void setMenustatus(Integer menustatus) {
        this.menustatus = menustatus;
    }

    /** 
     * 获取 备注 freemenu.remark
     * @return 备注
     */
    public final String getRemark() {
        return remark;
    }

    /** 
     * 设置 备注 freemenu.remark
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
        sb.append(", menuid=").append(menuid);
        sb.append(", menucode=").append(menucode);
        sb.append(", menuname=").append(menuname);
        sb.append(", parentmenucode=").append(parentmenucode);
        sb.append(", menulevel=").append(menulevel);
        sb.append(", menupath=").append(menupath);
        sb.append(", menustatus=").append(menustatus);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}