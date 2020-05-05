package com.example.MongoProject.Controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.MongoProject.Model.Employee;

import com.example.MongoProject.Service.EmployeeService;

@RestController
@RequestMapping(value= "/api/mongo/emp")
public class EmployeeController {

	@Autowired
    EmployeeService employeeService;
	
	@PostMapping(value= "/create")
    public String create(@RequestBody List<Employee> emp) {
		employeeService.createEmployee(emp);
	        return "Employee records created.";
	    }
	
	@GetMapping(value= "/getall")
    public Collection<Employee> getAll() {
        return employeeService.getAllEmployees();
    }
	@GetMapping(value= "/getbyid")
    public Optional<Employee> getById(@RequestParam(value= "employeeId") int id) {
        return employeeService.findEmployeeById(id);
    }
	
	@PutMapping(value= "/update")
    public String update(@RequestParam(value= "employeeId") int id, @RequestBody Employee e) {
        e.setId(id);
        employeeService.updateEmployee(e);
        return "Employee record for employeeId= " + id + " updated.";
    }
	
	@DeleteMapping(value= "/delete")
    public String delete(@RequestParam(value= "employeeId") int id) {
		employeeService.deleteEmployeeById(id);
        return "Employee record for employeeId= " + id + " deleted.";
    }
	
	@DeleteMapping(value= "/deleteall")
    public String deleteAll() {
		employeeService.deleteAllEmployees();
        return "All employee records deleted.";
    }
	
	}

