package com.test.employeedb.model;

import java.util.Date;
import javax.annotation.Generated;

public class DeptEmp {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.236680891+08:00", comments="Source field: dept_emp.emp_no")
    private Integer empNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.236912615+08:00", comments="Source field: dept_emp.dept_no")
    private String deptNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237066605+08:00", comments="Source field: dept_emp.from_date")
    private Date fromDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237206304+08:00", comments="Source field: dept_emp.to_date")
    private Date toDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.236787137+08:00", comments="Source field: dept_emp.emp_no")
    public Integer getEmpNo() {
        return empNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.236865418+08:00", comments="Source field: dept_emp.emp_no")
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.236980195+08:00", comments="Source field: dept_emp.dept_no")
    public String getDeptNo() {
        return deptNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237028715+08:00", comments="Source field: dept_emp.dept_no")
    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo == null ? null : deptNo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237109549+08:00", comments="Source field: dept_emp.from_date")
    public Date getFromDate() {
        return fromDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237168407+08:00", comments="Source field: dept_emp.from_date")
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237247247+08:00", comments="Source field: dept_emp.to_date")
    public Date getToDate() {
        return toDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.237287874+08:00", comments="Source field: dept_emp.to_date")
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}