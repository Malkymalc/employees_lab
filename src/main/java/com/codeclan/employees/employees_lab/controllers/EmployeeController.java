package com.codeclan.employees.employees_lab.controllers;


import com.codeclan.employees.employees_lab.models.Employee;
import com.codeclan.employees.employees_lab.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping
    public List<Employee> getAllEmployes(){
        return employeeRepository.findAll();
    }

    @GetMapping(value = "deleteall")
    public void deleteAllEmployees(){
        employeeRepository.deleteAll();
    }
}
