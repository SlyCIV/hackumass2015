package com.umass.hackathon;

import java.util.*;

public class ClauseCreator {

	public static IClauseComponent buildIClauseComponent( String[] s ) {
		
		String operator = null;
		ArrayList<Integer> indexes = findKeywordsIndexes(s);
		
		int i = indexes.size()/2;
		
		switch (s[i]) {
			case "greater":
				operator = ">";
				for (int j = i + 1; j < s.length - 1; j++) {
					if (s[j].equals("or") || s[j+1].equals("equal")) {
						operator += "=";
						break;
					}
				}
				break;
			case "less":
				operator = "<";
				for (int j = i + 1; j < s.length - 1; j++) {
					if (s[j].equals("or") && s[j+1].equals("equal")) {
						operator += "=";
						break;
					}
				}
				break;
			case "equals":
				operator = "==";
				break;
			case "plus":
				operator = "+";
				break;
			case "minus":
				operator = "-";
				break;
			case "times":
				operator = "*";
				break;
			case "divided":
				operator = "/";
				break;
			// is this the right keyword?
			case "exclusive":
				operator = "^";
				break;
			case "and":
				operator = "&&";
				break;
			case "or" :
				if ( !s[i-1].equals("bitwise") ) {
					operator = "||";
				}
				break;
			case "bitwise":
				if (s[i+1].equals("or")) {
					operator = "|";
				} else if (s[i+1].equals("and")){
					operator = "&";
				}
				break;
			case "not":
				operator = "!";
				break;
			case "invert":
				operator = "~";
				break;
			case "increment":
				operator = "++";
				break;
			case "decrement":
				operator = "--";
				break;
				
		}
		
		switch (s[i]) {
			case "greater":
			case "less":
			case "equals":
			case "plus":
			case "minus":
			case "times":
			case "divided":	
			case "exclusive":
			case "bitwise":
			case "and":
			case "or":
				IClauseComponent left = buildIClauseComponent( Arrays.copyOfRange(s, 0, i));
				IClauseComponent right = buildIClauseComponent( Arrays.copyOfRange(s, i+1, s.length));
				return new BinaryOp(operator, new IClauseComponent[]{left, right});
			case "not":
			case "invert":
			case "increment":
			case "decrement":
				IClauseComponent operand = buildIClauseComponent( Arrays.copyOfRange(s, i+1, s.length));
				return new UnaryOp(operator, operand);
		}
		
		// need something for a dynamic clause
	
		return null;
	}
	
	private static ArrayList<Integer> findKeywordsIndexes(String[] s) {
		
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		
		for (int i = 0; i < s.length; i++) {
			switch( s[i] ) {
				case "greater":
				case "less":
				case "equals":
				case "plus":
				case "minus":
				case "times":
				case "divided":				
				case "not":
				case "invert":
				case "increment":
				case "decrement":
				case "and":
				case "or":
				case "bitwise":
					i++;
					indexes.add(new Integer(i));
					break;
				default:
					break;
			}
			
			// later, we can have a function called "isDynamicClause()"
		}
		
		return indexes;
	}
	
}
