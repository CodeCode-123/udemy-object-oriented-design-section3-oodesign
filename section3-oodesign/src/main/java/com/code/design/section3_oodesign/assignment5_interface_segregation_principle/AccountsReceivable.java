package com.code.design.section3_oodesign.assignment5_interface_segregation_principle;

public class AccountsReceivable {
	private Accounting transactionObject;
	
	public AccountsReceivable(Accounting aTransaction) {
		this.transactionObject = aTransaction;
	}
	
	public void postPayment() {
		transactionObject.chargeCustomer();
	}
	
	public void sendInvoice() {
		transactionObject.prepareInovice();
		// sends the invoice
	}

}
