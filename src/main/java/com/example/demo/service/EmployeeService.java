package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(Long id);
}
