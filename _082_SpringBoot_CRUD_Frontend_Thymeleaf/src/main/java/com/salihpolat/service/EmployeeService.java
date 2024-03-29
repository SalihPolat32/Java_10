package com.salihpolat.service;

import com.salihpolat.model_entity.Employee;
import com.salihpolat.repository_dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
/*
        List<Employee> listEmployees = employeeRepository.findAll();

        if(listEmployees.size()>0)
            return listEmployees;
        else
            return new ArrayList<Employee>();
*/
        return employeeRepository.findAll();
    }

    public Employee createOrUpdateEmployee(Employee employee) {

        // CREATE - ADD
        if (employee.getId() == null) {
            employee = employeeRepository.save(employee);
            return employee;
        } else { // EDIT - UPDATE
            return employee;
        }
    }
}