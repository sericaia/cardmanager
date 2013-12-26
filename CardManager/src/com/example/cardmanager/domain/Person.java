package com.example.cardmanager.domain;

import java.util.HashMap;

public abstract class Person {
	
	protected int id; 			//auto-generated supplier ID
	protected int NIF;
	protected String name;
	protected HashMap<Integer, Card> cardMap;
	
	/**
	 * @param id
	 * @param nIF
	 * @param name
	 */
	public Person(int id, int nIF, String name) {
		this.id = id;
		NIF = nIF;
		this.name = name;
		this.cardMap = new HashMap<Integer, Card>();
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
		NIF = nIF;
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