package com.test.employeedb;

import static com.test.employeedb.mapper.DepartmentsDynamicSqlSupport.departments;
import static com.test.employeedb.mapper.DepartmentsDynamicSqlSupport.deptName;
import static com.test.employeedb.mapper.DeptEmpDynamicSqlSupport.deptEmp;
import static com.test.employeedb.mapper.EmployeesDynamicSqlSupport.employees;
import static com.test.employeedb.mapper.EmployeesDynamicSqlSupport.firstName;
import static com.test.employeedb.mapper.EmployeesDynamicSqlSupport.lastName;
import static org.mybatis.dynamic.sql.SqlBuilder.equalTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.employeedb.mapper.BaseMapper;
import com.test.employeedb.mapper.DeptEmpMapper;
import com.test.employeedb.vo.DempWithEmps;

@SpringBootTest
class EmployeeDbApplicationTests<T>{
	@Autowired
	DeptEmpMapper mapper;
	@Autowired
	BaseMapper<T> baseMapper;

	@Test
	void contextLoads() {
		SelectStatementProvider selectProvider = select(deptName, deptEmp.empNo, firstName, lastName)
				.from(departments)
				.leftJoin(deptEmp).on(departments.deptNo, equalTo(deptEmp.deptNo))
				.leftJoin(employees).on(deptEmp.empNo, equalTo(employees.empNo))
				.limit(10)
				.offset(5)
				.build()
				.render(RenderingStrategies.MYBATIS3);
		@SuppressWarnings("unchecked")
		List<DempWithEmps> selectManyCustom = (List<DempWithEmps>) baseMapper.selectManyCustom(selectProvider);
		System.out.println(selectManyCustom + "---------------------------");
	}

}
