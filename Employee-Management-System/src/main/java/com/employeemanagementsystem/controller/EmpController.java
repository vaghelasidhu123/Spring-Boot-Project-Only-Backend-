package com.employeemanagementsystem.controller;

import com.employeemanagementsystem.entity.Employee;
import com.employeemanagementsystem.service.EmployeeService;
import com.employeemanagementsystem.serviceImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpController
{
    @Autowired
    EmployeeService employeeService; //Dependcy Injection

    @GetMapping("/employees")
    public List <Employee> getAllEmployees(){

        return employeeService.readEmployees();
    }

    @PostMapping("/employees")
    public String createEmployee(@RequestBody Employee employee){

        employeeService.createEmployee(employee);
        return "Saved Successfully";
    }
}
