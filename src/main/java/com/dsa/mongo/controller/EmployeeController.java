package com.dsa.mongo.controller;


import com.dsa.mongo.entity.Employee;
import com.dsa.mongo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Employee create(@RequestBody Employee emp) {
        return service.save(emp);
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        return service.delete(id);
    }
}
