package com.test.employeedb.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class DeptEmpDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237390503+08:00", comments="Source Table: dept_emp")
    public static final DeptEmp deptEmp = new DeptEmp();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237615385+08:00", comments="Source field: dept_emp.emp_no")
    public static final SqlColumn<Integer> empNo = deptEmp.empNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237689864+08:00", comments="Source field: dept_emp.dept_no")
    public static final SqlColumn<String> deptNo = deptEmp.deptNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237753439+08:00", comments="Source field: dept_emp.from_date")
    public static final SqlColumn<Date> fromDate = deptEmp.fromDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.23781331+08:00", comments="Source field: dept_emp.to_date")
    public static final SqlColumn<Date> toDate = deptEmp.toDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237511732+08:00", comments="Source Table: dept_emp")
    public static final class DeptEmp extends AliasableSqlTable<DeptEmp> {
        public final SqlColumn<Integer> empNo = column("emp_no", JDBCType.INTEGER);

        public final SqlColumn<String> deptNo = column("dept_no", JDBCType.CHAR);

        public final SqlColumn<Date> fromDate = column("from_date", JDBCType.DATE);

        public final SqlColumn<Date> toDate = column("to_date", JDBCType.DATE);

        public DeptEmp() {
            super("dept_emp", DeptEmp::new);
        }
    }
}