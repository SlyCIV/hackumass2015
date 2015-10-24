package com.umass.hackathon;

public class UnaryOp implements IClauseComponent {
	
	String operator;
	IClauseComponent operand;
	
	public UnaryOp() {
		
	}
	
	public String printClauseComponent() {
		switch(this.operator) {
			case "!!":
			case "!":
			case "~":
			case "++pre":
			case "--pre":
				return "(" + this.operator + this.operand.printClauseComponent() + ")";
			case "++post":
			case "--post":
				return "(" + this.operand.printClauseComponent() + this.operator + ")";
			default:
				return null;
		
		}
	}
}