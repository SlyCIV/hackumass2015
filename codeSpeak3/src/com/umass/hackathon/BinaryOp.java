package com.umass.hackathon;

public class BinaryOp implements IClauseComponent {
	String operator;
	IClauseComponent[] operand;
	
	public BinaryOp(String operator, IClauseComponent[] operands) {
		this.operator = operator;
		this.operand = operands;
	}
	
	public String printIClauseComponent() {
		return "(" + this.operand[0].printIClauseComponent() + this.operator + this.operand[1].printIClauseComponent() + ")";
	}

}
