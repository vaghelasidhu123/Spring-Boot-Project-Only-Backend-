package com.employeemanagementsystem.serviceImpl;

import com.employeemanagementsystem.entity.Employee;
import com.employeemanagementsystem.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {


    List<Employee> employees = new ArrayList<>();

    @Override
    public Employee createEmployee(Employee employee) {
        employees.add(employee);
        return  employee;
    }

    @Override
    public List<Employee> readEmployees() {
        return List.of();
    }

    @Override
    public boolean deleteEmployee(Long id) {
        return false;
    }
}
