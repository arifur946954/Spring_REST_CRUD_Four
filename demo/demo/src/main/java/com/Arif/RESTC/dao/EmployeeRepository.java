package com.Arif.RESTC.dao;

import com.Arif.RESTC.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path ="teacher")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
