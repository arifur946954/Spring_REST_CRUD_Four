package com.Arif.RESTC.rest;

import com.Arif.RESTC.entity.Employee;
import com.Arif.RESTC.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class EmployeeRestController {
    private EmployeeService employeeService;
    //quick and dirty inject employeedao

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employee")
public List<Employee> findAll(){
        return employeeService.findAll();
}

    //expose employee and return employee
}
