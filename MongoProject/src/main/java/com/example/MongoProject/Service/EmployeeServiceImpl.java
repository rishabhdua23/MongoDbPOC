package com.example.MongoProject.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.MongoProject.Model.Employee;

import com.example.MongoProject.DAO.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
    EmployeeDAO employeeDAO;
	
	@Override
    public void createEmployee(List<Employee> emp) {
		employeeDAO.saveAll(emp);
    }
	
	@Override
    public Collection<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }
	@Override
    public Optional<Employee> findEmployeeById(int id) {
        return employeeDAO.findById(id);
    }
	@Override
    public void deleteEmployeeById(int id) {
		employeeDAO.deleteById(id);
    }
	@Override
    public void updateEmployee(Employee emp) {
		employeeDAO.save(emp);
    }
	 @Override
	    public void deleteAllEmployees() {
		 employeeDAO.deleteAll();
	    }
}
