package com.vss.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vss.module.Employee;
import com.vss.service.EmployeeServiceImp;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImp empService;
	
	@Autowired
	Employee empl;
	
	
	@PostMapping("/emp")
	public ResponseEntity<Employee> createUser(@RequestBody Employee emp) {
		return new ResponseEntity<>(empService.addUser(emp),HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> all(){
		return new ResponseEntity<>(empService.getAllEmployee(),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<Employee> findById(@PathVariable Integer id)throws Exception {
		return new ResponseEntity<>(empService.findById(id),HttpStatus.FOUND);
		
	}
	
	@DeleteMapping("/emp/{id}")
	public ResponseEntity<Employee> deleteById(@PathVariable Integer id)throws Exception {
		return new ResponseEntity<>(empService.deleteById(id),HttpStatus.OK);
		
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Employee> update(@RequestBody Employee emp) {
		return new ResponseEntity<>(empService.updateEmployee(emp),HttpStatus.OK);
	}
	
}
