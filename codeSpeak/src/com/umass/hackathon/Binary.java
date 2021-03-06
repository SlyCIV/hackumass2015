package com.umass.hackathon;

public abstract class Binary implements IOperator{
	IOperand partA, partB;
	IOperator operator;
	
	public Binary(IOperand partA, IOperand partB, IOperator operator){
		this.partA = partA;
		this.partB = partB;
		this.operator = operator;
	}
	
	public abstract String toString();
}