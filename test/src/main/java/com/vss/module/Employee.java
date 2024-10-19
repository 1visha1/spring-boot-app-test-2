package com.vss.module;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Employee {
	@Id
	Integer id;
	String name;
	String department;
	LocalDate joiningDate;
	String designation;
	Integer salary;
	public Employee() {
		
	}
	public Employee(Integer id, String name, String department, LocalDate joiningDate, String designation,
			Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.joiningDate = joiningDate;
		this.designation = designation;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
	
	
}
