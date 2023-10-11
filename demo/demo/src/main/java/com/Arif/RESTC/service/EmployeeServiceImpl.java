package com.Arif.RESTC.service;

import com.Arif.RESTC.dao.EmployeeDao;
import com.Arif.RESTC.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDao employeeDao;
@Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee findByID(int theId) {
        return employeeDao.findByID(theId);
    }
    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeDao.save(theEmployee);
    }

    @Override
    public void delete(int theId) {
    employeeDao.delete(theId);
    }
}
