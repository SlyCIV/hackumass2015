package com.umass.hackathon;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		while(currLine != NULL){
			Parser lineIn = new Parser("data/fileIO.txt");

			String[] currLine = lineIn.readSentence().split(" ");

			parse(currLine);

			currLine = currLine.readSentence();
		}
	}

	void parse(String[] n){
		if(n[0].toLowerCase().equals("within")){
			if(n[1].toLowerCase().equals("class")){
				Class temp = new Class(n);
				temp.name = n[2];
				temp.components = Arrays.copyofRange(n,3,n.length());
				temp.print();
			} else {
				Method temp = new Method();
				temp.name = n[2];
				temp.components = Arrays.copyofRange(n,3,n.length());
				temp.print();
			}
		} else if(n[0].toLowerCase().equals("create")){
			if(n[1].toLowerCase().equals("class")){
				Class temp = new Class(n);
				temp.name = n[2];
				temp.components = Arrays.copyofRange(n,3,n.length());
				temp.print();
			} else if(n[1].toLowerCase().equals("method")){
				Method temp = new Method();
				temp.name = n[2];
				temp.components = Arrays.copyofRange(n,3,n.length());
				temp.print();
			}
		}
	}
}