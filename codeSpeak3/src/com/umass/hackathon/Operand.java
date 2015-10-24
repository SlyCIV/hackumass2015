package com.umass.hackathon;

public class Operand implements IClauseComponent {

	String operand;
	
	public Operand() {}
	
	public String printIClauseComponent() {
		return operand;
	}
}
