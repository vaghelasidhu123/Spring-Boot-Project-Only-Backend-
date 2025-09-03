package com.employeemanagementsystem.controller;

import com.employeemanagementsystem.entity.Employee;
import com.employeemanagementsystem.entity.EmployeeEntity;
import com.employeemanagementsystem.service.EmployeeService;
import com.employeemanagementsystem.serviceImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.readEmployee(id);
    }

    @PostMapping("/employees")
    public String createEmployee(@RequestBody Employee employee){

         return employeeService.createEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Long id)
    {
         if(employeeService.deleteEmployee(id))
             return "Delete Successfully";
         return "Not found";
    }

    @PutMapping("/employees/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee)
    {
          return employeeService.updateEmployee(id, employee);
    }
}
