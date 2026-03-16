package com.code.design.section3_oodesign.assignment1.reporting;

import com.code.design.section3_oodesign.assignment1.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
		// TODO Auto-generated constructor stub
	}
	public String getFormatteredEmployee() {
		return getFormatteredValue();
	}

}
