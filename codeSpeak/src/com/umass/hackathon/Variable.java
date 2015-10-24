package com.umass.hackathon;

import java.util.Arrays;

public class Variable implements IClassComponent, IBodyPart {
	
	String name;
	String type;
	String value;
	
	public Variable(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public Variable(String[] s) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("called")) {
				this.name = s[++i];
			} else if (s[i].equals("type")) {
				this.type = s[++i];
			} else if (s[i].equals("value")) {
				this.value = s[i+2];
			}
		}
	}
	
	// this function will not do anything just yet
	// maybe will allow you to update a value later
	public void addComponent(String[] s) {}
	
	public void print() {}
	
	public String toString() {
		return this.type + " " + this.name;
	}
}
