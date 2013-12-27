package com.example.cardmanager.domain;

import java.util.ArrayList;
import java.util.Date;

import com.example.cardmanager.domain.test.IDomainPrettyPrinter;
import com.example.cardmanager.domain.test.IDomainPrettyPrinterVisitor;

public class Card implements IDomainPrettyPrinter{
	
	private int id; //customerPhoneNumber + code ranging from 000-999
	private int customerPhoneNumber;
	private int supplierPhoneNumber;
	//private int nMaxEntries; 		// maximum number of necessary stamps to complete
	private ArrayList<Stamp> stampList;

	/**
	 * Class constructor
	 * @param cardID
	 * @param customerID
	 * @param supplierID
	 * @param nMaxEntries
	 */
	public Card(int customerPhoneNumber, int supplierPhoneNumber, int cardMapSize) {
		//TODO generate ID here! replace the value 0
		this.id = 0;
		this.customerPhoneNumber = customerPhoneNumber;
		this.supplierPhoneNumber = supplierPhoneNumber;
		//this.nMaxEntries = nMaxEntries; TODO GENERATE nMaxEntries, based on the supplier
		this.stampList = new ArrayList<Stamp>();
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
	 * @return the customerPhoneNumber
	 */
	public int getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	/**
	 * @param customerPhoneNumber the customerID to set
	 */
	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	/**
	 * @return the supplierPhoneNumber
	 */
	public int getSupplierPhoneNumber() {
		return supplierPhoneNumber;
	}
	/**
	 * @param supplierPhoneNumber the supplierPhoneNumber to set
	 */
	public void setSupplierPhoneNumber(int supplierPhoneNumber) {
		this.supplierPhoneNumber = supplierPhoneNumber;
	}
//	/**
//	 * @return the nMaxEntries
//	 */
//	public int getnMaxEntries() {
//		return nMaxEntries;
//	}
//	/**
//	 * @param nMaxEntries the nMaxEntries to set
//	 */
//	public void setnMaxEntries(int nMaxEntries) {
//		this.nMaxEntries = nMaxEntries;
//	}
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
	public void addStamp(float payment){
		Stamp myStamp = new Stamp(new Date(), payment);
		//TODO verify if stamp already exists, if so, error
		stampList.add(myStamp);
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
