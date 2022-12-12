package com.test.employeedb.model;

import javax.annotation.Generated;

public class Departments {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:02.989920967+08:00", comments="Source field: departments.dept_no")
    private String deptNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:02.992542111+08:00", comments="Source field: departments.dept_name")
    private String deptName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:02.991842125+08:00", comments="Source field: departments.dept_no")
    public String getDeptNo() {
        return deptNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:02.992427172+08:00", comments="Source field: departments.dept_no")
    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo == null ? null : deptNo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:02.992631627+08:00", comments="Source field: departments.dept_name")
    public String getDeptName() {
        return deptName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:33:02.992723014+08:00", comments="Source field: departments.dept_name")
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}