package com.test.employeedb.model;

import java.util.Date;
import javax.annotation.Generated;

public class Employees {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.207721952+08:00", comments="Source field: employees.emp_no")
    private Integer empNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.210537117+08:00", comments="Source field: employees.birth_date")
    private Date birthDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.210844603+08:00", comments="Source field: employees.first_name")
    private String firstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.21116773+08:00", comments="Source field: employees.last_name")
    private String lastName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.211418274+08:00", comments="Source field: employees.gender")
    private String gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.211657842+08:00", comments="Source field: employees.hire_date")
    private Date hireDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.209792692+08:00", comments="Source field: employees.emp_no")
    public Integer getEmpNo() {
        return empNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.210411015+08:00", comments="Source field: employees.emp_no")
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.210660858+08:00", comments="Source field: employees.birth_date")
    public Date getBirthDate() {
        return birthDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.210759266+08:00", comments="Source field: employees.birth_date")
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.210930856+08:00", comments="Source field: employees.first_name")
    public String getFirstName() {
        return firstName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.211079904+08:00", comments="Source field: employees.first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.211254106+08:00", comments="Source field: employees.last_name")
    public String getLastName() {
        return lastName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.211342925+08:00", comments="Source field: employees.last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.211498011+08:00", comments="Source field: employees.gender")
    public String getGender() {
        return gender;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.211582984+08:00", comments="Source field: employees.gender")
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.211748081+08:00", comments="Source field: employees.hire_date")
    public Date getHireDate() {
        return hireDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-12T02:17:03.211833941+08:00", comments="Source field: employees.hire_date")
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employees [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}