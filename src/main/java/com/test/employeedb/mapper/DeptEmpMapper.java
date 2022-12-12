package com.test.employeedb.mapper;

import static com.test.employeedb.mapper.DeptEmpDynamicSqlSupport.deptEmp;
import static com.test.employeedb.mapper.DeptEmpDynamicSqlSupport.deptNo;
import static com.test.employeedb.mapper.DeptEmpDynamicSqlSupport.empNo;
import static com.test.employeedb.mapper.DeptEmpDynamicSqlSupport.fromDate;
import static com.test.employeedb.mapper.DeptEmpDynamicSqlSupport.toDate;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

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

import com.test.employeedb.model.DeptEmp;

@Mapper
public interface DeptEmpMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<DeptEmp>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.238814556+08:00", comments="Source Table: dept_emp")
    BasicColumn[] selectList = BasicColumn.columnList(empNo, deptNo, fromDate, toDate);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237878571+08:00", comments="Source Table: dept_emp")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DeptEmpResult", value = {
        @Result(column="emp_no", property="empNo", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dept_no", property="deptNo", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="from_date", property="fromDate", jdbcType=JdbcType.DATE),
        @Result(column="to_date", property="toDate", jdbcType=JdbcType.DATE)
    })
    List<DeptEmp> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237996794+08:00", comments="Source Table: dept_emp")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DeptEmpResult")
    Optional<DeptEmp> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.238100961+08:00", comments="Source Table: dept_emp")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, deptEmp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.238160485+08:00", comments="Source Table: dept_emp")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, deptEmp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.238235755+08:00", comments="Source Table: dept_emp")
    default int deleteByPrimaryKey(Integer empNo_, String deptNo_) {
        return delete(c -> 
            c.where(empNo, isEqualTo(empNo_))
            .and(deptNo, isEqualTo(deptNo_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.238305777+08:00", comments="Source Table: dept_emp")
    default int insert(DeptEmp row) {
        return MyBatis3Utils.insert(this::insert, row, deptEmp, c ->
            c.map(empNo).toProperty("empNo")
            .map(deptNo).toProperty("deptNo")
            .map(fromDate).toProperty("fromDate")
            .map(toDate).toProperty("toDate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.238447475+08:00", comments="Source Table: dept_emp")
    default int insertMultiple(Collection<DeptEmp> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, deptEmp, c ->
            c.map(empNo).toProperty("empNo")
            .map(deptNo).toProperty("deptNo")
            .map(fromDate).toProperty("fromDate")
            .map(toDate).toProperty("toDate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.238586426+08:00", comments="Source Table: dept_emp")
    default int insertSelective(DeptEmp row) {
        return MyBatis3Utils.insert(this::insert, row, deptEmp, c ->
            c.map(empNo).toPropertyWhenPresent("empNo", row::getEmpNo)
            .map(deptNo).toPropertyWhenPresent("deptNo", row::getDeptNo)
            .map(fromDate).toPropertyWhenPresent("fromDate", row::getFromDate)
            .map(toDate).toPropertyWhenPresent("toDate", row::getToDate)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.238890448+08:00", comments="Source Table: dept_emp")
    default Optional<DeptEmp> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, deptEmp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.238988113+08:00", comments="Source Table: dept_emp")
    default List<DeptEmp> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, deptEmp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.23944549+08:00", comments="Source Table: dept_emp")
    default List<DeptEmp> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, deptEmp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.239652299+08:00", comments="Source Table: dept_emp")
    default Optional<DeptEmp> selectByPrimaryKey(Integer empNo_, String deptNo_) {
        return selectOne(c ->
            c.where(empNo, isEqualTo(empNo_))
            .and(deptNo, isEqualTo(deptNo_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.239785505+08:00", comments="Source Table: dept_emp")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, deptEmp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.239853832+08:00", comments="Source Table: dept_emp")
    static UpdateDSL<UpdateModel> updateAllColumns(DeptEmp row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(empNo).equalTo(row::getEmpNo)
                .set(deptNo).equalTo(row::getDeptNo)
                .set(fromDate).equalTo(row::getFromDate)
                .set(toDate).equalTo(row::getToDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.240052949+08:00", comments="Source Table: dept_emp")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DeptEmp row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(empNo).equalToWhenPresent(row::getEmpNo)
                .set(deptNo).equalToWhenPresent(row::getDeptNo)
                .set(fromDate).equalToWhenPresent(row::getFromDate)
                .set(toDate).equalToWhenPresent(row::getToDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.24022163+08:00", comments="Source Table: dept_emp")
    default int updateByPrimaryKey(DeptEmp row) {
        return update(c ->
            c.set(fromDate).equalTo(row::getFromDate)
            .set(toDate).equalTo(row::getToDate)
            .where(empNo, isEqualTo(row::getEmpNo))
            .and(deptNo, isEqualTo(row::getDeptNo))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.240396694+08:00", comments="Source Table: dept_emp")
    default int updateByPrimaryKeySelective(DeptEmp row) {
        return update(c ->
            c.set(fromDate).equalToWhenPresent(row::getFromDate)
            .set(toDate).equalToWhenPresent(row::getToDate)
            .where(empNo, isEqualTo(row::getEmpNo))
            .and(deptNo, isEqualTo(row::getDeptNo))
        );
    }
}