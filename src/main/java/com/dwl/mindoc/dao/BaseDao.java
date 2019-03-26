package com.dwl.mindoc.dao;

import com.dwl.mindoc.database.Database;
import com.dwl.mindoc.domain.ColumnVo;
import com.dwl.mindoc.domain.TableVo;

import java.util.List;

/**
 * @program: mindoc
 * @description: 数据访问接口
 * @author: Javaaier
 * @create: 2019-3-16 13:39:8
 *
 */
public interface BaseDao {

	/**
	 * 获取数据库中业务表
	 * @param base 数据库类型
	 * @return 表对象列表 
	 */
    List<TableVo> getTables(Database base);

    
    /**
     * 获取业务表中字段对象列表
     * @param base 数据库类型
     * @param tableName 表名
     * @return 字段对象列表
     */
    List<ColumnVo> getColumns(Database base ,String tableName);

}
