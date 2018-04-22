package com.javacodegeeks.patterns.factorymethodpattern;

public class NYResponseXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("NY Parsing Response XML...");
		return "NY Response XML Message";
	}

}
