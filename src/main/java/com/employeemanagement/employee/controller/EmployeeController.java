package com.employeemanagement.employee.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.employee.entity.Employee;

import com.employeemanagement.employee.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	/*
	 * 
	 
	@GetMapping("/hello")
	ResponseEntity<String> hello() {
	    return ResponseEntity.ok("Hello World!");
	}
	
	*/
	
	
	/*
	@GetMapping("/get-employees")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employees = employeeService.getAllEmployees();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}
	*/
	
	
	
	//Get the list of all employees
	@GetMapping("/get-employees")
	public List<Employee> findAllUsers(){
		return employeeService.getAllEmployees();
	}
	
	
	
	
	
	
	
	/*
	
	@GetMapping("/getEmployeesByDeptId/{dept_id}")
	public Employee findEmployeeByDepartmentId(@PathVariable int dept_id) {
		return employeeService.getEmployeesByDeptId(dept_id);
	}
	*/
	
	/*
	@PostMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
 
        Employee emp = employeeService.addEmployee(employee);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
 
    @PutMapping("/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
 
        Employee emp = employeeService.editEmployees(employee);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
 
    @DeleteMapping("/employee")
    public ResponseEntity<String> deleteEmployee(@RequestParam(name = "employeeId") Integer employeeId) {
 
        employeeService.deleteEmployees(employeeId);
        return new ResponseEntity<>("Employee with ID :" + employeeId + " deleted successfully", HttpStatus.OK);
    }
    */
    
    
	
}
