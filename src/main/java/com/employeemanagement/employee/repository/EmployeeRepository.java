package com.employeemanagement.employee.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employeemanagement.employee.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("from Employee e where e.department.id = ?1")
	List<Employee> findAllByDeptId(int dept_id);

	
	
	
	
	 
}


