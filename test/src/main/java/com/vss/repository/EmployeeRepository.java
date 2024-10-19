package com.vss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vss.module.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
