package com.code.design.section3_oodesign.assignment1_single_responsibility_principle.clients;

import com.code.design.section3_oodesign.assignment1_single_responsibility_principle.domain.Employee;
import com.code.design.section3_oodesign.assignment1_single_responsibility_principle.domain.dao.EmployeeDAO;
import com.code.design.section3_oodesign.assignment1_single_responsibility_principle.reporting.EmployeeReportFormatter;
import com.code.design.section3_oodesign.assignment1_single_responsibility_principle.reporting.FormatType;

public class ClientModule {
	public static void main(String args[]) {
		Employee peggy = new Employee(1, "peggy", "accounting", true);
		ClientModule.hireNewEmployee(peggy);
		printEmployeeReport(peggy, FormatType.XML);
	}
	
	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.saveEmployee(employee);
	}
	public static void terminateEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.deleteEmployee(employee);
	}
	public static void printEmployeeReport(Employee employee, FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(formatter.getFormatteredEmployee());
	}
}
