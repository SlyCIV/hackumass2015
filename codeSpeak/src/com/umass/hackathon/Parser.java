package com.umass.hackathon;

import java.io.*;

public class Parser {
	
	String filename, buffer;
	BufferedReader reader;
	
	public Parser(String filename) {
		this.filename = filename;
		this.buffer = null;
		
		try {
			this.reader = new BufferedReader( new FileReader(this.filename) );
		} catch (IOException e) {
		    e.printStackTrace();
		    System.err.println("Unable to open file.");
		}
	}
	
	public String readFromFile() {
		try {
			return reader.readLine();
			
		} catch (IOException e) {
		    e.printStackTrace();
		    System.err.println("Unable to read from file.");
		    return null;
		}
	}
	
	public String readSentence() {
		
		if (this.buffer == null) {
			this.buffer = this.readFromFile();
		}
		
		int periodIndex;
		
		if ( (periodIndex = buffer.indexOf('.')) != -1) {
			
			String temp = this.buffer.substring(0, periodIndex);
			
			if (periodIndex+1 == buffer.length()) {
				this.buffer = null;
			} else {
				this.buffer = this.buffer.substring(periodIndex + 1, this.buffer.length());
			
				int i = 0;
				while( !Character.isAlphabetic(this.buffer.charAt(i)) || !Character.isDigit(this.buffer.charAt(i)) ) {
					i++;
				}
				this.buffer = this.buffer.substring(i, this.buffer.length() - 1);
			}
			
			return temp;
			
		} else {
			String temp = this.readFromFile();
			if (temp == null) { return null; }
			
			this.buffer = this.buffer + " " + temp;
			return readSentence();
		}
	}
}
