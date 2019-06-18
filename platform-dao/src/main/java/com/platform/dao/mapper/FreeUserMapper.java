/* https://github.com/orange1438 */
package com.platform.dao.mapper;
import com.platform.common.vm.UserVM;
import com.platform.dao.entity.FreeUser;
import org.springframework.stereotype.Repository;

/**
 * mybatis-generator-core-chinese-annotation1.3.5-chinese-annotation 自动生成
 * @author zhimin_hou
 * date:2019/05/08 11:34
 */
@Repository
public interface FreeUserMapper {
    /** 
     * 根据ID删除
     * @param userid 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Integer userid);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(FreeUser record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(FreeUser record);

    /** 
     * 根据ID查询
     * @param userid 主键ID
     * @return 返回查询的结果
     */
    FreeUser selectByPrimaryKey(Integer userid);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(FreeUser record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(FreeUser record);

    /**
     * 根据用户名和密码查询用户信息
     * @param userVM 查询字段对象
     * @return 返回用户信息
     */
    FreeUser selectByUserNameAndPsw(UserVM userVM);

    /**
     * 根据用户名或密码查询用户信息
     * @param userVM 查询字段对象
     * @return 返回用户信息
     */
    FreeUser selectByUserName(UserVM userVM);
}