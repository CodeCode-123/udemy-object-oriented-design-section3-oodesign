package com.code.design.section3_oodesign.assignment5_interface_segregation_principle;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {
	private List<Product> products;
	private Customer customer;
	
    public CustomerTransaction(List<Product> products, Customer customer) {
		super();
		this.products = products;
		this.customer = customer;
	}

	// methods for reporting
	@Override
	public String getName() {
		return customer.getName();
	}
	
	@Override
	public Date getDate() {
		return new Date();
	}
	
	@Override
	public String productBreakDown() {
		String reportList = "";
		for (Product product: products) {
			reportList += product.getProductName() + ", ";
		}
		return reportList.substring(0, reportList.length()-2);
	}
	
	@Override
	public void prepareInovice() {
		System.out.println("invoice prepared...");
	}
	
	@Override
	public void chargeCustomer() {
		System.out.println("charged the customer");
	}

}
