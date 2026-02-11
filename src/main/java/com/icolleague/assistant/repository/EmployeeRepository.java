package com.icolleague.assistant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.icolleague.assistant.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    // 👇 ADD THIS LINE
    Employee findByName(String name);
}