package com.employeemanagementsystem.service;

import java.util.*;
import com.employeemanagementsystem.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService
{
     String  createEmployee(Employee employee);

     List<Employee> readEmployees();

     boolean deleteEmployee(Long id);

     String updateEmployee(Long id, Employee employee);

     Employee readEmployee(Long id);
}
