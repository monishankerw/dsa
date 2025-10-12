package com.dsa.mongo.service;

import com.dsa.mongo.entity.Employee;
import com.dsa.mongo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public Employee save(Employee emp) {
        return repository.save(emp);
    }

    public Employee getById(String id) {
        return repository.findById(id).orElse(null);
    }

    public String delete(String id) {
        repository.deleteById(id);
        return "Employee deleted: " + id;
    }
}
