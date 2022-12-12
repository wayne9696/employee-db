package com.test.employeedb.mapper;

import static com.test.employeedb.mapper.EmployeesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.test.employeedb.model.Employees;
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
public interface EmployeesMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Employees>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.229281997+08:00", comments="Source Table: employees")
    BasicColumn[] selectList = BasicColumn.columnList(empNo, birthDate, firstName, lastName, gender, hireDate);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.219579209+08:00", comments="Source Table: employees")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EmployeesResult", value = {
        @Result(column="emp_no", property="empNo", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="birth_date", property="birthDate", jdbcType=JdbcType.DATE),
        @Result(column="first_name", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_name", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.CHAR),
        @Result(column="hire_date", property="hireDate", jdbcType=JdbcType.DATE)
    })
    List<Employees> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.222147978+08:00", comments="Source Table: employees")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EmployeesResult")
    Optional<Employees> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.222599487+08:00", comments="Source Table: employees")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, employees, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.223030712+08:00", comments="Source Table: employees")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, employees, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.223725058+08:00", comments="Source Table: employees")
    default int deleteByPrimaryKey(Integer empNo_) {
        return delete(c -> 
            c.where(empNo, isEqualTo(empNo_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.224182146+08:00", comments="Source Table: employees")
    default int insert(Employees row) {
        return MyBatis3Utils.insert(this::insert, row, employees, c ->
            c.map(empNo).toProperty("empNo")
            .map(birthDate).toProperty("birthDate")
            .map(firstName).toProperty("firstName")
            .map(lastName).toProperty("lastName")
            .map(gender).toProperty("gender")
            .map(hireDate).toProperty("hireDate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.226976704+08:00", comments="Source Table: employees")
    default int insertMultiple(Collection<Employees> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, employees, c ->
            c.map(empNo).toProperty("empNo")
            .map(birthDate).toProperty("birthDate")
            .map(firstName).toProperty("firstName")
            .map(lastName).toProperty("lastName")
            .map(gender).toProperty("gender")
            .map(hireDate).toProperty("hireDate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.228049973+08:00", comments="Source Table: employees")
    default int insertSelective(Employees row) {
        return MyBatis3Utils.insert(this::insert, row, employees, c ->
            c.map(empNo).toPropertyWhenPresent("empNo", row::getEmpNo)
            .map(birthDate).toPropertyWhenPresent("birthDate", row::getBirthDate)
            .map(firstName).toPropertyWhenPresent("firstName", row::getFirstName)
            .map(lastName).toPropertyWhenPresent("lastName", row::getLastName)
            .map(gender).toPropertyWhenPresent("gender", row::getGender)
            .map(hireDate).toPropertyWhenPresent("hireDate", row::getHireDate)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.230025081+08:00", comments="Source Table: employees")
    default Optional<Employees> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, employees, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.230385469+08:00", comments="Source Table: employees")
    default List<Employees> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, employees, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.230825404+08:00", comments="Source Table: employees")
    default List<Employees> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, employees, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.231317265+08:00", comments="Source Table: employees")
    default Optional<Employees> selectByPrimaryKey(Integer empNo_) {
        return selectOne(c ->
            c.where(empNo, isEqualTo(empNo_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.23170118+08:00", comments="Source Table: employees")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, employees, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.232167229+08:00", comments="Source Table: employees")
    static UpdateDSL<UpdateModel> updateAllColumns(Employees row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(empNo).equalTo(row::getEmpNo)
                .set(birthDate).equalTo(row::getBirthDate)
                .set(firstName).equalTo(row::getFirstName)
                .set(lastName).equalTo(row::getLastName)
                .set(gender).equalTo(row::getGender)
                .set(hireDate).equalTo(row::getHireDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.232685923+08:00", comments="Source Table: employees")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Employees row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(empNo).equalToWhenPresent(row::getEmpNo)
                .set(birthDate).equalToWhenPresent(row::getBirthDate)
                .set(firstName).equalToWhenPresent(row::getFirstName)
                .set(lastName).equalToWhenPresent(row::getLastName)
                .set(gender).equalToWhenPresent(row::getGender)
                .set(hireDate).equalToWhenPresent(row::getHireDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.233546262+08:00", comments="Source Table: employees")
    default int updateByPrimaryKey(Employees row) {
        return update(c ->
            c.set(birthDate).equalTo(row::getBirthDate)
            .set(firstName).equalTo(row::getFirstName)
            .set(lastName).equalTo(row::getLastName)
            .set(gender).equalTo(row::getGender)
            .set(hireDate).equalTo(row::getHireDate)
            .where(empNo, isEqualTo(row::getEmpNo))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.23421363+08:00", comments="Source Table: employees")
    default int updateByPrimaryKeySelective(Employees row) {
        return update(c ->
            c.set(birthDate).equalToWhenPresent(row::getBirthDate)
            .set(firstName).equalToWhenPresent(row::getFirstName)
            .set(lastName).equalToWhenPresent(row::getLastName)
            .set(gender).equalToWhenPresent(row::getGender)
            .set(hireDate).equalToWhenPresent(row::getHireDate)
            .where(empNo, isEqualTo(row::getEmpNo))
        );
    }
}