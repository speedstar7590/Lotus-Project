package com.lotus.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lotus.db.entity.Employee;
import com.lotus.db.entity.EmployeeDetails;
import com.lotus.db.repository.EmployeeRepository;

/**
 * 
 * this is used for save the data 
 * @author Santosh
 *
 */

@SpringBootApplication
public class ParentChildRelationshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParentChildRelationshipApplication.class, args);
	}

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void run(String... args) throws Exception {
		// Create a new Employee
		Employee employee = new Employee("Santosh", "Kumar", "santosh@example.com");

		// Create Employee Detail
		EmployeeDetails employeeDetail = new EmployeeDetails("Developer", "Information Technology", "MALE",
				92000L, "HYD,IND");

		// Set child reference(employeeDetail) in parent entity(employee)
		employee.setEmployeeDetail(employeeDetail);

		// Set parent reference(employee) in child entity(employeeDetail)
		employeeDetail.setEmployee(employee);

		// Save in database
		EmployeeRepository.save(employee);

	}

}
