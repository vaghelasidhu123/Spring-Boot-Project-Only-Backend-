package com.employeemanagementsystem.service;

import java.util.*;
import com.employeemanagementsystem.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService
{
     Employee createEmployee(Employee employee);

     List<Employee> readEmployees();

     boolean deleteEmployee(Long id);

}
