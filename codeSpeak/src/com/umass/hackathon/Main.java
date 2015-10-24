package com.umass.hackathon;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		String[] currLine = null;
		while(currLine.length > 0){
			Parser lineIn = new Parser("data/fileIO.txt");

			currLine = lineIn.readSentence().split(" ");

			parse(currLine);
		}
	}
	
	String parse(String[] n){
		String temp = "";
		String temp2 = "";
		String retval = "";
		int i = 0;
		
		switch(n[0].toLowerCase()){
		case "if":
			i = 1;
			while(!n[i].contains(",")){
				temp += n[i];
				temp += " ";
				i++;
			}
			
			i++;
			
			while(!n[i].contains(",")){
				temp2 += n[i];
				temp2 += " ";
				i++;
			}
			
			retval += iff(temp, temp2);
		case "create":
			if(n[1].toLowerCase().contains("class")){
				retval += "public class " + n[2] + "{\n\n}\n";
				return retval;
			}
			if(n[1].toLowerCase().contains("method")){
				String input = "";
				i = 10;
				while(i < n.length){
					input += n[i];
					input += " ";
					i++;
				}
				retval += "public " + n[4] + " " + n[6] + "(" + input + ")"+ "{\n\n}\n";
				return retval;
			}
			retval = n[1] + " " + n[2] + " = " + n[4];
			return retval;
		default:
			return "";
		}
	}
	
	public String iff(String clause, String predicate){
		String retval = "";
		retval += "if(";
		retval += clause(clause);
		retval += "){\n";
		retval += predicate(predicate);
		retval += "\n}\n";
		return retval;
	}

	public String predicate(String temp) {
		// TODO Auto-generated method stub
		return null;
	}

	public String clause(String temp) {
		// TODO Auto-generated method stub
		return null;
	}
}



























