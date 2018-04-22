package com.javacodegeeks.patterns.factorymethodpattern;

public class NYOrderXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("NY Parsing Order XML...");
		return "NY Order XML Message";
	}

}
