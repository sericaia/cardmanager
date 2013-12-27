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
		super(nIF,name,phoneNumber);
	}
	
	/**
	 * creates a new card and adds it to card list, might be different in the future
	 */
	public void addCard(Card card){
		cardMap.put((Integer)card.getId(), card);
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
