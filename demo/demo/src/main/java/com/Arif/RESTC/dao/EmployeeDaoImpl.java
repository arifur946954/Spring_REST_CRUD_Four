package com.Arif.RESTC.dao;

import com.Arif.RESTC.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    //Setup filed for entity manager
    private EntityManager entityManager;
     @Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //inject constructor
    @Override
    public List<Employee> findAll() {
         //create query
        TypedQuery<Employee> theQuery=entityManager.createQuery("from Employee", Employee.class);
        //execute query
      List<Employee> employee=  theQuery.getResultList();
        //return result
        //res
        return employee;
    }
}
