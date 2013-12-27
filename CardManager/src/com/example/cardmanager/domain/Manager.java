package com.example.cardmanager.domain;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.cardmanager.domain.test.IDomainPrettyPrinter;
import com.example.cardmanager.domain.test.IDomainPrettyPrinterVisitor;

public class Manager implements IDomainPrettyPrinter{

	private Person loginUser; //login user
	
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
	
	void createSupplier(){//login, create new account
		
	}
	void createCustomer(){}//login, create new account
	
	/**
	 * Adds stamp to 
	 * @param supplierPhoneNumber
	 * @param payment
	 */
	void addStamp(int supplierPhoneNumber, float payment){
		
		getCustomer(loginUser.getPhoneNumber()).addStamp(supplierPhoneNumber, payment);
		getSupplier(supplierPhoneNumber).addStamp(loginUser.getPhoneNumber(), payment);
		
	}
	
	/** 
	 * Receives stampCode (from QRCode, generated code, etc.) and returns the correspondent supplier id (supplierPhoneNumber)
	 * @param stampCode
	 */
	int identifySupplierByStampCode(int stampCode){
		//TODO 
		return 0;
		
	}
	
	void login(){}
	void logout(){}
	
	/**
	 * Pretty Printer Visitor in action
	 * @param visitor
	 */
	@Override
	public void accept(IDomainPrettyPrinterVisitor visitor) {
		visitor.visit(this);
		
		for(Customer customer : customerMap.values()) {
			customer.accept(visitor);
        }
		for(Supplier supplier : supplierMap.values()) {
            supplier.accept(visitor);
        }
				
	}
}
