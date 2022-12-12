package com.test.employeedb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;

@Mapper
public interface BaseMapper<T> extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<T>, CommonUpdateMapper{
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("dempWithEmps")
    List<T> selectManyCustom(SelectStatementProvider selectStatement);
}
