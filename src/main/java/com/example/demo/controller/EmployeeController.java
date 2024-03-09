package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployee();
    }
    @GetMapping("/getEmployees/{id}")
    public Employee getEmployeesById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }
}
