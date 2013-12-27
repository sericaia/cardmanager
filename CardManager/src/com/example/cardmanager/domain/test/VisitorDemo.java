package com.example.cardmanager.domain.test;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.cardmanager.domain.Customer;
import com.example.cardmanager.domain.Manager;
import com.example.cardmanager.domain.Supplier;

public class VisitorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("::: VISITOR EXAMPLE :::");
			
		//debug: populate supplier list
		ArrayList<String> supplierList = new ArrayList<String>();
		supplierList.add("h3");
		supplierList.add("continente");
		supplierList.add("chimarrao");

		//debug: populate supplier map
		HashMap<Integer, Supplier> supplierMap = new HashMap<Integer, Supplier>();
		Supplier s1 = new Supplier();
		Supplier s2 = new Supplier();
		Supplier s3 = new Supplier();
		supplierMap.put(930000000, s1);
		supplierMap.put(930000001, s2);
		supplierMap.put(930000002, s3);
		
		
		//debug: populate customer map
		HashMap<Integer, Customer> customerMap = new HashMap<Integer, Customer>();
		Customer c1 = new Customer();
		customerMap.put(960000000, c1);

		IDomainPrettyPrinter ManagerPrinter = new Manager(supplierList, supplierMap, customerMap);
		ManagerPrinter.accept(new DomainPrettyPrinterVisitor());
	}

}
