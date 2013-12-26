package com.example.cardmanager.domain;

import java.util.ArrayList;


public class Supplier extends Person{

	private long id; 			//auto-generated supplier ID
	private long NIF;
	private String name;
	private ArrayList<Card> cardList;//HashMap<String, Card> cardMap=new HashMap<String, Card>();

	
	/** 
	 * Class Contructor
	 * @param id
	 * @param nIF
	 * @param name
	 */
	public Supplier(long id, long nIF, String name) {
		super(id,nIF,name);
		this.cardList = new ArrayList<Card>();
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @param nIF the nIF to set
	 */
	public void setNIF(long nIF) {
		NIF = nIF;
	}
	/**
	 * @return the nIF
	 */
	public long getNIF() {
		return NIF;
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
	 * @return the cardList
	 */
	public ArrayList<Card> getCardList() {
		return cardList;
	}
	/**
	 * @param cardList the cardList to set
	 */
	public void setCardList(ArrayList<Card> cardList) {
		this.cardList = cardList;
	}

	/**
	 * creates a new card and adds it to card list	  
	 */
	public void addCard(long cardID, long customerID, int nMaxEntries){
		Card myCard = new Card(cardID, customerID, this.id, nMaxEntries);
		cardList.add(myCard);
	}
}
