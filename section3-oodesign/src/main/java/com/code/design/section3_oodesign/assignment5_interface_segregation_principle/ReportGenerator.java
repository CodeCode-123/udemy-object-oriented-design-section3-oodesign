package com.code.design.section3_oodesign.assignment5_interface_segregation_principle;

public class ReportGenerator {
	private Reporting transactionObject;
	
	public ReportGenerator(Reporting transactionObject) {
		super();
		this.transactionObject = transactionObject;
	}

	public void generateReport() {
		System.out.println("Customer name: " + transactionObject.getName() + ", Products: "
	            + transactionObject.productBreakDown() + ", Date: " 
				+ transactionObject.getDate());
	}

}
