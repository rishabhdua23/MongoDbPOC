package com.example.MongoProject.DAO;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.MongoProject.Model.Employee;

@Repository
public interface EmployeeDAO extends MongoRepository<Employee, Integer>{

}
