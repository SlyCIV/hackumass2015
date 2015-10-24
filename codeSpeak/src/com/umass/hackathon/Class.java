package com.umass.hackathon;
import java.util.*;

public class Class implements ICreatable {

	String name;
	ArrayList<IClassComponent> components;
	
	public Class() {
		components = new ArrayList<IClassComponent>();
	}
	
	public void fill(String[] s) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("called")) {
				this.name = s[++i];
			}
		}
	}
	
	public void print() {
		// what if class extends or implements something?
		System.out.println("public class " + this.name + " " + "{");
		for (int i = 0; i < components.size(); i++) {
			components.get(i).print();
		}
		System.out.println("}");
	}
}
