package com.example.cardmanager.domain;


public class Supplier extends Person{

	/** 
	 * Class Contructor
	 * @param nIF
	 * @param name
	 * @param phonenumber
	 */
	public Supplier(int nIF, String name, int phoneNumber) {
		super(nIF,name, phoneNumber);
	}
	/**
	 * creates a new card and adds it to card list, might be different in the future	  
	 */
	public void addCard(Card card){
		cardMap.put((Integer)card.getId(), card);
	}
}
