package com.umass.hackathon;
import java.util.*;

public class Method implements IClassComponent {
	// fields
	String name;
	String type;
	String input;
	ArrayList<IBodyPart> parts;
	
	public Method() {
		parts = new ArrayList<IBodyPart>();
	}
	
	public void fill(String[] s) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("called")) {
				this.name = s[++i];
			} else if (s[i].equals("type")) {
				this.type = s[++i];
			} else if (s[i].equals("input")) {
				input = getInput(Arrays.copyOfRange(s, i, s.length - 1));
			}
		}
	}
	
	
	public String getInput(String[] s) {
		return "This is where the input goes";
	}
	
	public void print() {
		System.out.println("public " + this.type + " " + this.name + " (" + this.input + ") {");
		for (int i = 0; i < parts.size(); i++) {
			this.parts.get(i).print();
		}
		System.out.println("}");
	}
}
