package com.example.cardmanager.domain;

import java.util.HashMap;

public abstract class Person {
	
	protected int NIF;
	protected String name;
	protected int phoneNumber;
	protected HashMap<Integer, Card> cardMap;
	
	/**
	 * @param nIF
	 * @param name
	 * @param phoneNumber
	 */
	public Person(int nIF, String name, int phoneNumber) {
		this.NIF = nIF;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.cardMap = new HashMap<Integer, Card>();
	}
	/**
	 * @return the nIF
	 */
	public int getNIF() {
		return NIF;
	}
	/**
	 * @param nIF the nIF to set
	 */
	public void setNIF(int nIF) {
		this.NIF = nIF;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param name the name to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber= phoneNumber;
	}
	
	/**
	 * @return the cardMap
	 */
	public HashMap<Integer, Card> getCardMap() {
		return cardMap;
	}
	/**
	 * @param cardMap the cardMap to set
	 */
	public void setCardMap(HashMap<Integer, Card> cardMap) {
		this.cardMap = cardMap;
	}
	/**
	 * creates a new card and adds it to card list	  
	 */
	public void addCard(int customerID, int supplierID){
	}
	
}