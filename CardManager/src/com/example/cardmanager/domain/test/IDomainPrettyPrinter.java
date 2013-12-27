package com.example.cardmanager.domain.test;

public interface IDomainPrettyPrinter {

	void accept(IDomainPrettyPrinterVisitor visitor); //Domain elements have to provide accept
}
