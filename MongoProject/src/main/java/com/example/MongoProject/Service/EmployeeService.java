package com.example.MongoProject.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.MongoProject.Model.Employee;

public interface EmployeeService {

	public void createEmployee(List<Employee> emp);
	public Collection<Employee> getAllEmployees();
	public Optional<Employee> findEmployeeById(int id);
	public void deleteEmployeeById(int id);
	public void updateEmployee(Employee emp);
	public void deleteAllEmployees();
}
