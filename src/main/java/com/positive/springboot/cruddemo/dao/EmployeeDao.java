package com.positive.springboot.cruddemo.dao;

import java.util.List;

import com.positive.springboot.cruddemo.model.Employee;

public interface EmployeeDao {
	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

}
