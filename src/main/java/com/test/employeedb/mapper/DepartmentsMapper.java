package com.test.employeedb.mapper;

import static com.test.employeedb.mapper.DepartmentsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.test.employeedb.model.Departments;
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
public interface DepartmentsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Departments>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.008579347+08:00", comments="Source Table: departments")
    BasicColumn[] selectList = BasicColumn.columnList(deptNo, deptName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:02.998910705+08:00", comments="Source Table: departments")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DepartmentsResult", value = {
        @Result(column="dept_no", property="deptNo", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="dept_name", property="deptName", jdbcType=JdbcType.VARCHAR)
    })
    List<Departments> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.00088279+08:00", comments="Source Table: departments")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DepartmentsResult")
    Optional<Departments> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.001384922+08:00", comments="Source Table: departments")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, departments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.00187087+08:00", comments="Source Table: departments")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, departments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.002556493+08:00", comments="Source Table: departments")
    default int deleteByPrimaryKey(String deptNo_) {
        return delete(c -> 
            c.where(deptNo, isEqualTo(deptNo_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.003079288+08:00", comments="Source Table: departments")
    default int insert(Departments row) {
        return MyBatis3Utils.insert(this::insert, row, departments, c ->
            c.map(deptNo).toProperty("deptNo")
            .map(deptName).toProperty("deptName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.006167287+08:00", comments="Source Table: departments")
    default int insertMultiple(Collection<Departments> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, departments, c ->
            c.map(deptNo).toProperty("deptNo")
            .map(deptName).toProperty("deptName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.007119563+08:00", comments="Source Table: departments")
    default int insertSelective(Departments row) {
        return MyBatis3Utils.insert(this::insert, row, departments, c ->
            c.map(deptNo).toPropertyWhenPresent("deptNo", row::getDeptNo)
            .map(deptName).toPropertyWhenPresent("deptName", row::getDeptName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.00963157+08:00", comments="Source Table: departments")
    default Optional<Departments> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, departments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.010143171+08:00", comments="Source Table: departments")
    default List<Departments> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, departments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.01060012+08:00", comments="Source Table: departments")
    default List<Departments> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, departments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.011082962+08:00", comments="Source Table: departments")
    default Optional<Departments> selectByPrimaryKey(String deptNo_) {
        return selectOne(c ->
            c.where(deptNo, isEqualTo(deptNo_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.011718562+08:00", comments="Source Table: departments")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, departments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.012351155+08:00", comments="Source Table: departments")
    static UpdateDSL<UpdateModel> updateAllColumns(Departments row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(deptNo).equalTo(row::getDeptNo)
                .set(deptName).equalTo(row::getDeptName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.012999595+08:00", comments="Source Table: departments")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Departments row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(deptNo).equalToWhenPresent(row::getDeptNo)
                .set(deptName).equalToWhenPresent(row::getDeptName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.014099059+08:00", comments="Source Table: departments")
    default int updateByPrimaryKey(Departments row) {
        return update(c ->
            c.set(deptName).equalTo(row::getDeptName)
            .where(deptNo, isEqualTo(row::getDeptNo))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:03.014803156+08:00", comments="Source Table: departments")
    default int updateByPrimaryKeySelective(Departments row) {
        return update(c ->
            c.set(deptName).equalToWhenPresent(row::getDeptName)
            .where(deptNo, isEqualTo(row::getDeptNo))
        );
    }
}