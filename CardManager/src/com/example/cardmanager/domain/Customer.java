package com.example.cardmanager.domain;

import com.example.cardmanager.domain.test.IDomainPrettyPrinter;
import com.example.cardmanager.domain.test.IDomainPrettyPrinterVisitor;


public class Customer extends Person implements IDomainPrettyPrinter{

	/** 
	 * Class Contructor
	 * @param nIF
	 * @param name
	 * @param phoneNumber
	 * 	
	 */
	public Customer(int nIF, String name, int phoneNumber) {
		super(nIF, name, phoneNumber);
	}
	
	/**
	 * adds a new stamp to the respective card
	 */
	public void addStamp(int supplierPhoneNumber, float payment){
		getCardMap().get(supplierPhoneNumber).addStamp(payment);
	}

	/**
	 * Pretty Printer Visitor in action
	 * @param visitor
	 */
	@Override
	public void accept(IDomainPrettyPrinterVisitor visitor) {
		visitor.visit(this);		
	}

}
