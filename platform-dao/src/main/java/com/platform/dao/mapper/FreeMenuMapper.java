/* https://github.com/orange1438 */
package com.platform.dao.mapper;
import com.platform.dao.entity.FreeMenu;
import org.springframework.stereotype.Repository;

/**
 * mybatis-generator-core-chinese-annotation1.3.5-chinese-annotation 自动生成
 * @author zhimin_hou
 * date:2019/05/08 11:34
 */
@Repository
public interface FreeMenuMapper {
    /** 
     * 根据ID删除
     * @param menuid 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Integer menuid);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(FreeMenu record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(FreeMenu record);

    /** 
     * 根据ID查询
     * @param menuid 主键ID
     * @return 返回查询的结果
     */
    FreeMenu selectByPrimaryKey(Integer menuid);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(FreeMenu record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(FreeMenu record);
}