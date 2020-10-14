package com.employeemanagement.employee.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.employeemanagement.employee.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//Employee findAllByDeptId(int dept_id);

	
	
	
	 
}



