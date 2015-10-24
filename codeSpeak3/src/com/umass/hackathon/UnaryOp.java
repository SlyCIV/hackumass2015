package com.umass.hackathon;

public class UnaryOp implements IClauseComponent {
	
	String operator;
	IClauseComponent operand;
	
	public UnaryOp(String operator, IClauseComponent operand) {
		this.operator = operator;
		this.operand = operand;
	}
	
	public String printIClauseComponent() {
		switch(this.operator) {
			case "!!":
			case "!":
			case "~":
			case "++ ":
			case "-- ":
				return "(" + this.operator + this.operand.printIClauseComponent() + ")";
			case " ++":
			case " --":
				return "(" + this.operand.printIClauseComponent() + this.operator + ")";
			default:
				return null;
		
		}
	}
}
