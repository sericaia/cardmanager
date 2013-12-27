package com.example.cardmanager.domain;

import com.example.cardmanager.domain.test.IDomainPrettyPrinter;
import com.example.cardmanager.domain.test.IDomainPrettyPrinterVisitor;


public class Supplier extends Person implements IDomainPrettyPrinter{

	/** 
	 * Class Contructor
	 * @param nIF
	 * @param name
	 * @param phoneNumber
	 * 
	 */
	public Supplier(int nIF, String name, int phoneNumber) {
		super(nIF, name, phoneNumber);
	}
	
	/**
	 * adds a new stamp to the respective card
	 */
	public void addStamp(int customerPhoneNumber, float payment){
		getCardMap().get(customerPhoneNumber).addStamp(payment);
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
