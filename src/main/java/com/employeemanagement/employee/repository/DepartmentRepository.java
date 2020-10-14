package com.employeemanagement.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagement.employee.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
