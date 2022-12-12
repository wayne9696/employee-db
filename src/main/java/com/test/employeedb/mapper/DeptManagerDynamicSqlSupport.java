package com.test.employeedb.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class DeptManagerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.241361931+08:00", comments="Source Table: dept_manager")
    public static final DeptManager deptManager = new DeptManager();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.241573532+08:00", comments="Source field: dept_manager.emp_no")
    public static final SqlColumn<Integer> empNo = deptManager.empNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.241664361+08:00", comments="Source field: dept_manager.dept_no")
    public static final SqlColumn<String> deptNo = deptManager.deptNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.241758231+08:00", comments="Source field: dept_manager.from_date")
    public static final SqlColumn<Date> fromDate = deptManager.fromDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.241842147+08:00", comments="Source field: dept_manager.to_date")
    public static final SqlColumn<Date> toDate = deptManager.toDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.241458954+08:00", comments="Source Table: dept_manager")
    public static final class DeptManager extends AliasableSqlTable<DeptManager> {
        public final SqlColumn<Integer> empNo = column("emp_no", JDBCType.INTEGER);

        public final SqlColumn<String> deptNo = column("dept_no", JDBCType.CHAR);

        public final SqlColumn<Date> fromDate = column("from_date", JDBCType.DATE);

        public final SqlColumn<Date> toDate = column("to_date", JDBCType.DATE);

        public DeptManager() {
            super("dept_manager", DeptManager::new);
        }
    }
}