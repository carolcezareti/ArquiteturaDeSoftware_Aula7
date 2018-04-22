package com.javacodegeeks.patterns.factorymethodpattern;

public interface AbstractParserFactory {
	
	public XMLParser getParserInstance (String parseType);

}
