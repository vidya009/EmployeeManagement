package com.employeemanagement.employee.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.employee.entity.Department;
import com.employeemanagement.employee.entity.Employee;
import com.employeemanagement.employee.repository.EmployeeRepository;
import com.employeemanagement.employee.repository.DepartmentRepository;



@Service
public class EmployeeService {
	
	@Autowired
    EmployeeRepository employeeRepository;
 
    @Autowired
     DepartmentRepository departmentRepository;
 
    //get all employee list
    public List<Employee> getAllEmployees() {
 
        return employeeRepository.findAll();
    }
    
    
   

 	//POST: Add/Save new employee
    public Employee addEmployee(Employee employee) {
   	 
        Department dept = departmentRepository.findById(employee.getDepartment().getId()).orElse(null);
        if (null == dept) {
            dept = new Department();
        }
        dept.setDeptName(employee.getDepartment().getDeptName());
        employee.setDepartment(dept);
        return employeeRepository.save(employee);
    }
    
    
    
    // GET: Find/search list of employees by department id
    public List<Employee> getEmployeesByDeptId(int dept_id) {    
    	return employeeRepository.findAllByDeptId(dept_id);
    }



	public List<Department> getAllDeaprtments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}
    
	
	
    
 
/*
 
 
 	// PUT: Update existing employee 
    public Employee editEmployees(Employee entity) {
 
        return employeeRepository.save(entity);
    }
 
 	//DELETE: Delete existing employee
    public void deleteEmployees(Integer id) {
 
        employeeRepository.deleteById(id);
    }
*/
 
    
}