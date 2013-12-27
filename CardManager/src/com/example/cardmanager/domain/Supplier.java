package com.example.cardmanager.domain;


public class Supplier extends Person{

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
}
