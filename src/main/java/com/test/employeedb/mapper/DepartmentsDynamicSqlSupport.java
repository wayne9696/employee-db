package com.test.employeedb.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class DepartmentsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:02.997149044+08:00", comments="Source Table: departments")
    public static final Departments departments = new Departments();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:02.997607092+08:00", comments="Source field: departments.dept_no")
    public static final SqlColumn<String> deptNo = departments.deptNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:02.998086017+08:00", comments="Source field: departments.dept_name")
    public static final SqlColumn<String> deptName = departments.deptName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:02.99738195+08:00", comments="Source Table: departments")
    public static final class Departments extends AliasableSqlTable<Departments> {
        public final SqlColumn<String> deptNo = column("dept_no", JDBCType.CHAR);

        public final SqlColumn<String> deptName = column("dept_name", JDBCType.VARCHAR);

        public Departments() {
            super("departments", Departments::new);
        }
    }
}