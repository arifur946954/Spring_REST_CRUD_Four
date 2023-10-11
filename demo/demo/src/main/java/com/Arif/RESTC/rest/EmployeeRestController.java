package com.Arif.RESTC.rest;

import com.Arif.RESTC.entity.Employee;
import com.Arif.RESTC.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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

@GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee theEmployee=employeeService.findByID(employeeId);
        if (theEmployee==null){
            throw new RuntimeException("id not found :"+employeeId);

        }
        return theEmployee;

    }
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(0);
      Employee dbEmployee=  employeeService.save(theEmployee);
      return dbEmployee;

    }
}
