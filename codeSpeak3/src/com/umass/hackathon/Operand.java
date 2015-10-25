package com.umass.hackathon;

import java.util.Arrays;

public class Operand implements IClauseComponent {

	String operand;
	
	public Operand(String[] s) { 
		this.operand = "";
		for (int i = 0; i < s.length; i++) {
			switch (s[i]) {
				case "than":
					break;
				case "is":
					break;
				default:
					this.operand = s[i];
					break;
			}
		}
	}
	
	public String printIClauseComponent() {
		return operand;
	}
}
