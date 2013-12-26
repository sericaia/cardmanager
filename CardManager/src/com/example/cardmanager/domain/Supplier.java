package com.example.cardmanager.domain;


public class Supplier extends Person{

	/** 
	 * Class Contructor
	 * @param id
	 * @param nIF
	 * @param name
	 */
	public Supplier(int id, int nIF, String name) {
		super(id,nIF,name);
	}
	/**
	 * creates a new card and adds it to card list	  
	 */
	public void addCard(int customerID, int supplierID){
		Card myCard = new Card(customerID, this.id);
		cardMap.put((Integer)myCard.getID(), myCard);
	}
}
