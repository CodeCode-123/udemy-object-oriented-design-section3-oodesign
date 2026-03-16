package com.code.design.section3_oodesign.assignment5_interface_segregation_principle;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		// create a product list
		List<Product> products = new ArrayList<>();
		// create a customer
		Customer customer = new Customer();
		customer.setName("John");
		// add product to the product list
		Product productOne = new Product(1, "Iphone");
		Product productTwo = new Product(2, "Computer");
		Product productThree = new Product(3, "Television");
		products.add(productOne);
		products.add(productTwo);
		products.add(productThree);
		// Initialize the Reporting
		Reporting reporting = new CustomerTransaction(products, customer);
		ReportGenerator report = new ReportGenerator(reporting);
		report.generateReport();
	}
}
