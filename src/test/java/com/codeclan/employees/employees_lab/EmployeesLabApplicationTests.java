package com.codeclan.employees.employees_lab;

import com.codeclan.employees.employees_lab.models.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.codeclan.employees.employees_lab.repositories.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeesLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveEmployee(){
		Employee alana = new Employee("Alana", 27, 1, "hungdaddy54@gmail.com");
		employeeRepository.save(alana);
	}

}

