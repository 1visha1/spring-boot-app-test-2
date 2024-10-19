package com.vss.service;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vss.module.Employee;

@Service
public interface EmployeeService {
	
	public Employee addUser(Employee employee);
	
	public Employee findById(Integer id)throws Exception;
	
	public Employee deleteById(Integer id)throws Exception;
	
	public List<Employee> getAllEmployee();
	
	public Employee updateEmployee(Employee emp) ;
	
}
