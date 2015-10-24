package com.umass.hackathon;

public class Comperative extends Binary {
	
	public Comperative(IOperand partA, IOperand partB, IOperator operator){
		super(partA, partB, operator);
	}
	
	public String toString(){
		String retval = "";
		retval += this.partA.toString();
		retval += this.operator.toString();
		retval += this.partB.toString();
		return retval;
	}
}