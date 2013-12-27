package com.example.cardmanager.domain;

import java.util.ArrayList;
import java.util.HashMap;

public class Manager {

	private Person loginPerson; //login user
	
	private ArrayList<String> supplierList; //list of suppliers (for now the name, but in the future should be important to have other information like location, phone number, etc).
	
	private HashMap<Integer, Supplier> supplierMap;
	private HashMap<Integer, Customer> customerMap;
	
	void assignCard(int customerPhoneNumber, int supplierPhoneNumber){
		
		Card myCard = new Card(customerPhoneNumber, supplierPhoneNumber,10);
		Supplier supplier = getSupplier(supplierPhoneNumber);
		Customer customer = getCustomer(customerPhoneNumber);
		
		supplier.addCard(myCard);
		customer.addCard(myCard);
	}
	
	private Supplier getSupplier(int supplierPhoneNumber){
		return supplierMap.get(supplierPhoneNumber);
	}
	
	private Customer getCustomer(int customerPhoneNumber){
		return customerMap.get(customerPhoneNumber);
	}
	
	void createSupplier(){
		
	}
	void createCustomer(){}
	
	/**
	 * Adds stamp to 
	 * @param supplierPhoneNumber
	 * @param payment
	 */
	void assignStamp(int supplierPhoneNumber, float payment){
		getCustomer(loginPerson.getPhoneNumber()).getCardMap().get(supplierPhoneNumber).addStamp(payment);
		getSupplier(supplierPhoneNumber).getCardMap().get(supplierPhoneNumber).addStamp(payment);
	}
	
	/** 
	 * Receives stampCode (from QRCode, generated code, etc.) and returns the correspondent supplier id (supplierPhoneNumber)
	 * @param stampCode
	 */
	int identifySupplierByStampCode(int stampCode){
		//TODO 
		return 0;
		
	}
}
