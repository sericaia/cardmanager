package com.example.cardmanager.domain;


public class Customer extends Person{

	private int phoneNumber;
	/** 
	 * Class Contructor
	 * @param id
	 * @param nIF
	 * @param name
	 * @param phoneNumber
	 * 	
	 */
	public Customer(int id, int nIF, String name, int phoneNumber) {
		super(id,nIF,name);
		this.phoneNumber = phoneNumber;	
	}
	
	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * creates a new card and adds it to card list	  
	 */
	public void addCard(int customerID, int supplierID){
		Card myCard = new Card(this.id, supplierID);
		cardMap.put((Integer)myCard.getID(), myCard);
	}

}
