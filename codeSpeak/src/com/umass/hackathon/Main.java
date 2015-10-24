package com.umass.hackathon;

public class main{
	public static void main(String[] args){
		Parser lineIn = new Parser("data/fileIO.txt");

		String[] currLine = lineIn.readSentence().split(" ");

		parse(currLine);
	}

	void parse(String[] n){
		if(n[0].toLowerCase().equals("within")){
			
		}
	}
}