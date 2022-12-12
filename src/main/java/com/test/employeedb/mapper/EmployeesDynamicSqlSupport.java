package com.test.employeedb.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class EmployeesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.216598835+08:00", comments="Source Table: employees")
    public static final Employees employees = new Employees();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.217219967+08:00", comments="Source field: employees.emp_no")
    public static final SqlColumn<Integer> empNo = employees.empNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.217901246+08:00", comments="Source field: employees.birth_date")
    public static final SqlColumn<Date> birthDate = employees.birthDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.218052336+08:00", comments="Source field: employees.first_name")
    public static final SqlColumn<String> firstName = employees.firstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.218178335+08:00", comments="Source field: employees.last_name")
    public static final SqlColumn<String> lastName = employees.lastName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.218304493+08:00", comments="Source field: employees.gender")
    public static final SqlColumn<String> gender = employees.gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.218433645+08:00", comments="Source field: employees.hire_date")
    public static final SqlColumn<Date> hireDate = employees.hireDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.216972+08:00", comments="Source Table: employees")
    public static final class Employees extends AliasableSqlTable<Employees> {
        public final SqlColumn<Integer> empNo = column("emp_no", JDBCType.INTEGER);

        public final SqlColumn<Date> birthDate = column("birth_date", JDBCType.DATE);

        public final SqlColumn<String> firstName = column("first_name", JDBCType.VARCHAR);

        public final SqlColumn<String> lastName = column("last_name", JDBCType.VARCHAR);

        public final SqlColumn<String> gender = column("gender", JDBCType.CHAR);

        public final SqlColumn<Date> hireDate = column("hire_date", JDBCType.DATE);

        public Employees() {
            super("employees", Employees::new);
        }
    }
}