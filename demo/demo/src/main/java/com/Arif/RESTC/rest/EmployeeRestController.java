package com.Arif.RESTC.rest;

import com.Arif.RESTC.dao.EmployeeDao;
import com.Arif.RESTC.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class EmployeeRestController {
    private EmployeeDao employeeDao;
    //quick and dirty inject employeedao
    public EmployeeRestController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    @GetMapping("/employee")
public List<Employee> findAll(){
        return employeeDao.findAll();
}

    //expose employee and return employee
}
