package com.test.employeedb.model;

import java.util.Date;
import javax.annotation.Generated;

public class DeptManager {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.240667074+08:00", comments="Source field: dept_manager.emp_no")
    private Integer empNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.240818138+08:00", comments="Source field: dept_manager.dept_no")
    private String deptNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.240973222+08:00", comments="Source field: dept_manager.from_date")
    private Date fromDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.241083584+08:00", comments="Source field: dept_manager.to_date")
    private Date toDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.24071536+08:00", comments="Source field: dept_manager.emp_no")
    public Integer getEmpNo() {
        return empNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.240780744+08:00", comments="Source field: dept_manager.emp_no")
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.240868966+08:00", comments="Source field: dept_manager.dept_no")
    public String getDeptNo() {
        return deptNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.240925809+08:00", comments="Source field: dept_manager.dept_no")
    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo == null ? null : deptNo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.241014217+08:00", comments="Source field: dept_manager.from_date")
    public Date getFromDate() {
        return fromDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.241051731+08:00", comments="Source field: dept_manager.from_date")
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.241119798+08:00", comments="Source field: dept_manager.to_date")
    public Date getToDate() {
        return toDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.241172554+08:00", comments="Source field: dept_manager.to_date")
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}