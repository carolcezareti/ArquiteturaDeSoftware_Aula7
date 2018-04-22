package com.javacodegeeks.patterns.factorymethodpattern;

public class NYFeedbackXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("NY Parsing Feedback XML...");
		return "NY Feedback XML Message";
	}

}
