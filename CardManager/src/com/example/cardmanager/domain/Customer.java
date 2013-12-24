package com.example.cardmanager.domain;

import java.util.ArrayList;

import android.app.Application;

public class Customer extends Application{

	private String id; 			//auto-generated client ID
	private int NIF;
	private String name;
	private int phoneNumber;
	private ArrayList<Card> cardList = new ArrayList<Card>();//HashMap<String, Card> cardMap=new HashMap<String, Card>();
	
	
	/** 
	 * Class Contructor
	 * @param id
	 * @param nIF
	 * @param name
	 * @param phoneNumber
	 * 	
	 */
	public Customer(String id, int nIF, String name, int phoneNumber) {
		this.id = id;
		NIF = nIF;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.cardList = new ArrayList<Card>();		
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
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
	public void addCard(String cardID, String supplierID, int nMaxEntries){
		Card myCard = new Card(cardID, this.id, supplierID, nMaxEntries);
		cardList.add(myCard);
	}

}
