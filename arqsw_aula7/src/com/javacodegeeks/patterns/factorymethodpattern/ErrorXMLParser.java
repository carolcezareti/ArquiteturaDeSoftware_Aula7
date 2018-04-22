package com.javacodegeeks.patterns.factorymethodpattern;

public class ErrorXMLParser implements XMLParser {
	@Override
	public String parse() {
		System.out.println("Hello World");
		return "Error XML Message";
	}

}
