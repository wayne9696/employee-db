package com.test.employeedb.vo;

public class EmpWithName {
    String empNo;
    String firstname;
    String lastname;
    public String getEmpNo() {
        return empNo;
    }
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Override
    public String toString() {
        return "EmpWithName [empNo=" + empNo + ", firstname=" + firstname + ", lastname=" + lastname + "]";
    }
}
