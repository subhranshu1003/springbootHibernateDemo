package com.positive.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.positive.springboot.cruddemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
