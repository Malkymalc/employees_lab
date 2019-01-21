package com.codeclan.employees.employees_lab.repositories;

import com.codeclan.employees.employees_lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
