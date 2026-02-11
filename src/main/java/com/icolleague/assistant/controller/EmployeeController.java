package com.icolleague.assistant.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.icolleague.assistant.model.Employee;
import com.icolleague.assistant.repository.EmployeeRepository;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

    private final EmployeeRepository repo;

    public EmployeeController(EmployeeRepository repo) {
        this.repo = repo;
    }

    // ✅ Phase-1: Admin - Load all employees
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    // ✅ Phase-1: Admin - Add employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return repo.save(employee);
    }

    // ✅ Phase-2: Employee - Get status by name
    @GetMapping("/employees/status/{name}")
    public Employee getEmployeeStatus(@PathVariable String name) {
        return repo.findByName(name);
    }
}