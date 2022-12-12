package com.test.employeedb.vo;

import java.util.List;

public class DempWithInnerEmps {
    String deptName;
    List<EmpWithNames> empWithNames;
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public List<EmpWithNames> getEmpWithNames() {
        return empWithNames;
    }
    public void setEmpWithNames(List<EmpWithNames> empWithNames) {
        this.empWithNames = empWithNames;
    }
    @Override
    public String toString() {
        return "DempWithInnerEmps [deptName=" + deptName + ", empWithNames=" + empWithNames + "]";
    }
    class EmpWithNames{
        String empNo;
        String firstname;
        String lastname;
        @Override
        public String toString() {
            return "EmpWithNames [empNo=" + empNo + ", firstname=" + firstname + ", lastname=" + lastname + "]";
        }
    }
}
