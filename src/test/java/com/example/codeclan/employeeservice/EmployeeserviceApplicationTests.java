package com.example.codeclan.employeeservice;

import com.example.codeclan.employeeservice.models.Employee;
import com.example.codeclan.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Employee Alan = new Employee("Alan", 42, 25050725, "alanhood77@gmail.com");
		employeeRepository.save(Alan);
	}

}
