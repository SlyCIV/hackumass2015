package com.umass.hackathon;

public class TestParser {
	public static void main(String[] args) {
		Parser p = new Parser("data/test_parser.txt");
		
		for (String s = p.readSentence(); s != null; s = p.readSentence()) {
			System.out.println(s);
		}
	}
}
