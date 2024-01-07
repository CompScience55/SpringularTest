package com.NeumTi.SpringularTest.repo;

import com.NeumTi.SpringularTest.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Employee findEmployeeByLastName(String lastName);

    Employee findEmployeeById(Long id);
}
