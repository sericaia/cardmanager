package com.example.cardmanager.domain;

import java.util.ArrayList;

public class Card{
	
	private int id;
	private int customerID;
	private int supplierID;
	private int nMaxEntries; 		// maximum number of necessary stamps to complete
	private ArrayList<Stamp> stampList;//HashMap<String, Stamp> stampMap=new HashMap<String, Stamp>();


	/**
	 * Class constructor
	 * @param cardID
	 * @param customerID
	 * @param supplierID
	 * @param nMaxEntries
	 */
	public Card( int customerID, int supplierID) {
		//this.id = id; TODO GENERATE ID
		this.customerID = customerID;
		this.supplierID = supplierID;
		//this.nMaxEntries = nMaxEntries; TODO GENERATE nMaxEntries, based on the supplier
		this.stampList = new ArrayList<Stamp>();
	}
	/**
	 * @return the cardID
	 */
	public int getID() {
		return id;
	}
	/**
	 * @param cardID the cardID to set
	 */
	public void setID(int id) {
		this.id = id;
	}
	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the supplierID
	 */
	public int getSupplierID() {
		return supplierID;
	}
	/**
	 * @param supplierID the supplierID to set
	 */
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
	/**
	 * @return the nMaxEntries
	 */
	public int getnMaxEntries() {
		return nMaxEntries;
	}
	/**
	 * @param nMaxEntries the nMaxEntries to set
	 */
	public void setnMaxEntries(int nMaxEntries) {
		this.nMaxEntries = nMaxEntries;
	}
	/**
	 * @return the stampList
	 */
	public ArrayList<Stamp> getStampList() {
		return stampList;
	}
	/**
	 * @param stampList the stampList to set
	 */
	public void setStampList(ArrayList<Stamp> stampList) {
		this.stampList = stampList;
	}

	/**
	 * @return the size of the stampList, which is the actual number of entries/stamps
	 */
	public int getNumberOfStamps(){
		return stampList.size();		
	}
	
	/**
	 * creates a new stamp and adds it to stamp list
	 * @param date
	 * @param payment
	 */
	public void addStamp(String date, float payment){
		Stamp myStamp = new Stamp(this.id, date, payment);
		stampList.add(myStamp);
	}
}
