package com.employeemanagement.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "designation")
public class Designation {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="designation_id")
	private int designation_id;
	
	@Column(name = "designation_name")
	private String designation_name;
	
	
	//getter setter
	public int getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(int designation_id) {
		this.designation_id = designation_id;
	}

	public String getDesignation_name() {
		return designation_name;
	}

	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}

	@Override
	public String toString() {
		return "Designation [designation_id=" + designation_id + ", designation_name=" + designation_name + "]";
	}
	
}