package com.javacodegeeks.patterns.factorymethodpattern;

public class ResponseXMLParser implements XMLParser {
	
	@Override
	public String parse() {
		System.out.println("Hello World");
		return "Response XML Message";
	}

}
