package com.code.design.section3_oodesign.assignment1_single_responsibility_principle.domain.dao;

import com.code.design.section3_oodesign.assignment1_single_responsibility_principle.domain.Employee;

public class EmployeeDAO {
	public void saveEmployee(Employee employee) {
		System.out.println("saved employee to the database: " + employee);
	}
	public void deleteEmployee(Employee employee) {
		System.out.println("deleted employee from the database: " + employee);
	}

}
