package com.umass.hackathon;

public class Operand implements IClauseComponent {

	String operand;
	
	public Operand(String name) {
		this.operand = name;
	}
	
	public String printClauseComponent() {
		return operand;
	}
	
	public static IClause makeClause()
}