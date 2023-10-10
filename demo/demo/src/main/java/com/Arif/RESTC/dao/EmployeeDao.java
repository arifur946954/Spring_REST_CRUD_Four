package com.Arif.RESTC.dao;

import com.Arif.RESTC.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();
}
