package com.example.cardmanager.domain.test;

import com.example.cardmanager.domain.Card;
import com.example.cardmanager.domain.Customer;
import com.example.cardmanager.domain.Manager;
import com.example.cardmanager.domain.Stamp;
import com.example.cardmanager.domain.Supplier;

public class DomainPrettyPrinterVisitor implements IDomainPrettyPrinterVisitor{

	@Override
	public void visit(Customer customer) {
		System.out.println("::: Customer found :::");
	}

	@Override
	public void visit(Supplier supplier) {
		System.out.println("::: Supplier found :::");		
	}

	@Override
	public void visit(Card card) {
		System.out.println("::: Card found :::");
		
	}

	@Override
	public void visit(Stamp stamp) {
		System.out.println("::: Stamp found :::");		
	}
	
	@Override
	public void visit(Manager manager) {
		System.out.println("::: Manager found :::");		

	}

}
