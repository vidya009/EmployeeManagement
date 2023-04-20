package com.employeemanagement.employee.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.employee.entity.Department;
import com.employeemanagement.employee.entity.Employee;

import com.employeemanagement.employee.service.EmployeeService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;



	//Get the list of all employees
	@GetMapping("/getEmployees")
	public List<Employee> findAllUsers(){
		System.out.println("Helooooo");
		return employeeService.getAllEmployees();
	}



	//Get the list of all employees
	@GetMapping("/getAllDeaprtments")
	public List<Department> getAllDeaprtments(){
		System.out.println("Helooooo");
		return employeeService.getAllDeaprtments();
	}


	//add new employee
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}



	@GetMapping("/getEmployeesByDeptId/{dept_id}")
	public List<Employee> findEmployeeByDepartmentId(@PathVariable int dept_id) {
		return employeeService.getEmployeesByDeptId(dept_id);
	}

}