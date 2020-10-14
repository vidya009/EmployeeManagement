package com.employeemanagement.employee.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@Column(name = "dept_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dept_id;
	
	@Column(name = "dept_name")
	private String dept_name;
	
	
	@OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "deptEmp_fk", referencedColumnName = "dept_id")
	private List<Employee> employees;
	
	
	
	
	
	
	
	//getter setter
	public int getDept_id() {
		return dept_id;
	}
	
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
	}


}
