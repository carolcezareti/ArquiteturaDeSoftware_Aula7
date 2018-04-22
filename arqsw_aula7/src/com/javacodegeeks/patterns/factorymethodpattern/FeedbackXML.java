package com.javacodegeeks.patterns.factorymethodpattern;

public class FeedbackXML implements XMLParser{
	
	@Override
	public String parse() {
		System.out.println("Hello World");
		return "Feedback XML Message";
	}

}
