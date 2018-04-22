package com.javacodegeeks.patterns.factorymethodpattern;

public class OrderXMLParser implements XMLParser {
	
	@Override
	public String parse() {
		System.out.println("Hello World");
		return "Order XML Message";
		
	}

}
