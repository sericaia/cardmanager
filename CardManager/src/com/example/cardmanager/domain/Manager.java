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
	
	/**
	 * @param supplierList
	 * @param supplierMap
	 * @param customerMap
	 */
	public Manager() {
		this.supplierList = new ArrayList<String>();
		this.supplierMap = new HashMap<Integer, Supplier>();
		this.customerMap = new HashMap<Integer, Customer>();		
	}

	/**
	 * @param supplierList
	 * @param supplierMap
	 * @param customerMap
	 */
	public Manager(ArrayList<String> supplierList,
			HashMap<Integer, Supplier> supplierMap,
			HashMap<Integer, Customer> customerMap) {
		this.supplierList = supplierList;
		this.supplierMap = supplierMap;
		this.customerMap = customerMap;
	}

	/**
	 * @return the supplierList
	 */
	public ArrayList<String> getSupplierList() {
		return supplierList;
	}

	/**
	 * @param supplierList the supplierList to set
	 */
	public void setSupplierList(ArrayList<String> supplierList) {
		this.supplierList = supplierList;
	}

	/**
	 * @return the supplierMap
	 */
	public HashMap<Integer, Supplier> getSupplierMap() {
		return supplierMap;
	}

	/**
	 * @param supplierMap the supplierMap to set
	 */
	public void setSupplierMap(HashMap<Integer, Supplier> supplierMap) {
		this.supplierMap = supplierMap;
	}

	/**
	 * @return the customerMap
	 */
	public HashMap<Integer, Customer> getCustomerMap() {
		return customerMap;
	}

	/**
	 * @param customerMap the customerMap to set
	 */
	public void setCustomerMap(HashMap<Integer, Customer> customerMap) {
		this.customerMap = customerMap;
	}

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
		
		if(!customerMap.isEmpty()){
			for(Customer customer : customerMap.values()) {
			customer.accept(visitor);
			}
		}
		if(!supplierMap.isEmpty()){
			for(Supplier supplier : supplierMap.values()) {
	            supplier.accept(visitor);
	        }
		}
				
	}
}
