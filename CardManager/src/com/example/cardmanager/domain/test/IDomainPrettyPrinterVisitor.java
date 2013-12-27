package com.example.cardmanager.domain.test;

import com.example.cardmanager.domain.*;

public interface IDomainPrettyPrinterVisitor {

	void visit(Customer customer);
	void visit(Supplier supplier);
	void visit(Card card);
	void visit(Stamp stamp);
	void visit(Manager manager);
}
