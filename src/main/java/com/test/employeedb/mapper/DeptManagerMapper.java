package com.test.employeedb.mapper;

import static com.test.employeedb.mapper.DeptManagerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.test.employeedb.model.DeptManager;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface DeptManagerMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<DeptManager>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.242850709+08:00", comments="Source Table: dept_manager")
    BasicColumn[] selectList = BasicColumn.columnList(empNo, deptNo, fromDate, toDate);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.241927915+08:00", comments="Source Table: dept_manager")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DeptManagerResult", value = {
        @Result(column="emp_no", property="empNo", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dept_no", property="deptNo", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="from_date", property="fromDate", jdbcType=JdbcType.DATE),
        @Result(column="to_date", property="toDate", jdbcType=JdbcType.DATE)
    })
    List<DeptManager> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.242063904+08:00", comments="Source Table: dept_manager")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DeptManagerResult")
    Optional<DeptManager> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.242126696+08:00", comments="Source Table: dept_manager")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, deptManager, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.242197088+08:00", comments="Source Table: dept_manager")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, deptManager, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.242248307+08:00", comments="Source Table: dept_manager")
    default int deleteByPrimaryKey(Integer empNo_, String deptNo_) {
        return delete(c -> 
            c.where(empNo, isEqualTo(empNo_))
            .and(deptNo, isEqualTo(deptNo_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.24230597+08:00", comments="Source Table: dept_manager")
    default int insert(DeptManager row) {
        return MyBatis3Utils.insert(this::insert, row, deptManager, c ->
            c.map(empNo).toProperty("empNo")
            .map(deptNo).toProperty("deptNo")
            .map(fromDate).toProperty("fromDate")
            .map(toDate).toProperty("toDate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.242457195+08:00", comments="Source Table: dept_manager")
    default int insertMultiple(Collection<DeptManager> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, deptManager, c ->
            c.map(empNo).toProperty("empNo")
            .map(deptNo).toProperty("deptNo")
            .map(fromDate).toProperty("fromDate")
            .map(toDate).toProperty("toDate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.242593144+08:00", comments="Source Table: dept_manager")
    default int insertSelective(DeptManager row) {
        return MyBatis3Utils.insert(this::insert, row, deptManager, c ->
            c.map(empNo).toPropertyWhenPresent("empNo", row::getEmpNo)
            .map(deptNo).toPropertyWhenPresent("deptNo", row::getDeptNo)
            .map(fromDate).toPropertyWhenPresent("fromDate", row::getFromDate)
            .map(toDate).toPropertyWhenPresent("toDate", row::getToDate)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.242907942+08:00", comments="Source Table: dept_manager")
    default Optional<DeptManager> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, deptManager, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.242962505+08:00", comments="Source Table: dept_manager")
    default List<DeptManager> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, deptManager, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.243013195+08:00", comments="Source Table: dept_manager")
    default List<DeptManager> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, deptManager, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.243061777+08:00", comments="Source Table: dept_manager")
    default Optional<DeptManager> selectByPrimaryKey(Integer empNo_, String deptNo_) {
        return selectOne(c ->
            c.where(empNo, isEqualTo(empNo_))
            .and(deptNo, isEqualTo(deptNo_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.24311962+08:00", comments="Source Table: dept_manager")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, deptManager, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.243172297+08:00", comments="Source Table: dept_manager")
    static UpdateDSL<UpdateModel> updateAllColumns(DeptManager row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(empNo).equalTo(row::getEmpNo)
                .set(deptNo).equalTo(row::getDeptNo)
                .set(fromDate).equalTo(row::getFromDate)
                .set(toDate).equalTo(row::getToDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.243346037+08:00", comments="Source Table: dept_manager")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DeptManager row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(empNo).equalToWhenPresent(row::getEmpNo)
                .set(deptNo).equalToWhenPresent(row::getDeptNo)
                .set(fromDate).equalToWhenPresent(row::getFromDate)
                .set(toDate).equalToWhenPresent(row::getToDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.24350465+08:00", comments="Source Table: dept_manager")
    default int updateByPrimaryKey(DeptManager row) {
        return update(c ->
            c.set(fromDate).equalTo(row::getFromDate)
            .set(toDate).equalTo(row::getToDate)
            .where(empNo, isEqualTo(row::getEmpNo))
            .and(deptNo, isEqualTo(row::getDeptNo))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.243634892+08:00", comments="Source Table: dept_manager")
    default int updateByPrimaryKeySelective(DeptManager row) {
        return update(c ->
            c.set(fromDate).equalToWhenPresent(row::getFromDate)
            .set(toDate).equalToWhenPresent(row::getToDate)
            .where(empNo, isEqualTo(row::getEmpNo))
            .and(deptNo, isEqualTo(row::getDeptNo))
        );
    }
}