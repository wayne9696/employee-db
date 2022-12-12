package com.test.employeedb.vo;

import java.util.List;

public class DempWithEmps {
    String deptName;
    List<EmpWithName> empWithNames;
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public List<EmpWithName> getEmpWithNames() {
        return empWithNames;
    }
    public void setEmpWithNames(List<EmpWithName> empWithNames) {
        this.empWithNames = empWithNames;
    }
    @Override
    public String toString() {
        return "DempWithEmps [deptName=" + deptName + ", empWithNames=" + empWithNames + "]";
    }
}
