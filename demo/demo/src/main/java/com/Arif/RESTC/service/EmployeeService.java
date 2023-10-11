package com.Arif.RESTC.service;

import com.Arif.RESTC.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findByID(int theId);
    Employee save(Employee theEmployee);
    void delete(int theId);
}
