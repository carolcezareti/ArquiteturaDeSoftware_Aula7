package com.javacodegeeks.patterns.factorymethodpattern;

public class NYErrorXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("NY Parsing Error XML...");
		return "NY Error XML Message";
	}

}
