package com.umass.hackathon;

public class Unary implements IOperator{
	String[] components;
	
	public Unary(String[] components){
		this.components = components;
	}
	
	public String toString(){
		String temp = "";
		for(int i = 0; i < this.components.length; i++){
			temp += this.components[i];
		}
		return temp;
	}
}