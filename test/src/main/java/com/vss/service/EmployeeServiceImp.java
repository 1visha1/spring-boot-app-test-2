package com.vss.service;



import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vss.module.Employee;
import com.vss.repository.EmployeeRepository;

@Service

public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepo;


	
	@Override
	public Employee addUser(Employee employee) {
		
		employeeRepo.save(employee);
		return employee;
	}

	@Override
	public Employee findById(Integer id)throws Exception {
		
		Optional<Employee> opt = employeeRepo.findById(id);
		if(opt.isEmpty()) {
			throw new Exception("post not found with id: "+id);
		}
		return opt.get();
	
	}

	@Override
	public Employee deleteById(Integer id) throws Exception{
		// TODO Auto-generated method stub
		Optional<Employee> opt = employeeRepo.findById(id);
		if(opt.isEmpty()) {
			throw new Exception("post not found with id: "+id);
		}
		employeeRepo.deleteById(id);
		return opt.get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeRepo.save(emp);
		
		return emp;
	}

}
