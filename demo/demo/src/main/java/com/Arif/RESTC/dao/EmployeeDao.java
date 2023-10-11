package com.Arif.RESTC.dao;

import com.Arif.RESTC.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();
    Employee findByID(int theId);
    Employee save(Employee theEmployee);
    void delete(int theId);
}
