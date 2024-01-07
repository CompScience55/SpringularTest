package com.NeumTi.SpringularTest.service;

import com.NeumTi.SpringularTest.entities.Employee;
import com.NeumTi.SpringularTest.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public void deleteEmployeeById(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> findEmployeeByLastName(String lastName) {
        return Optional.ofNullable(employeeRepo.findEmployeeByLastName(lastName));
    }

    public Optional<Employee> findEmployeeById(Long id) {
        return Optional.ofNullable(employeeRepo.findEmployeeById(id));
    }
}


