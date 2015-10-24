package com.umass.hackathon;

public class BinaryOp implements IClauseComponent {
	String operator;
	IClauseComponent[] operand;
	
	public BinaryOp(String operator, String[] operands) {
		operand = new IClauseComponent[2];
		this.operator = operator;
		this.operand = operand;
	}
	
	public String printClauseComponent() {
		return "(" + this.operand[0].printClauseComponent() + this.operator + this.operand[1].printClauseComponent() + ")";
	}

}
