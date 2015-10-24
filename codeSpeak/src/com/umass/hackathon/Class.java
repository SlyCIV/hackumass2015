package com.umass.hackathon;
import java.util.*;

public class Class implements ICreatable {

	String name;
	ArrayList<IClassComponent> components;
	
	public Class(String[] s) {
		components = new ArrayList<IClassComponent>();
		
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("called")) {
				this.name = s[++i];
				break;
			}
		}
	}
	
	public void addComponent(String[] s) {
		IClassComponent newComp = null;
		
		int i;
		for (i = 0; i < s.length; i++) {
			if (s[i].equals("method")) {
				newComp = new Method( Arrays.copyOfRange(s, ++i, s.length ) );
				break;
			} else if (s[i].equals("variable")) {
				newComp = new Variable( Arrays.copyOfRange(s, ++i, s.length) );
				break;
			}
		}
		
		if (newComp != null) {
			this.components.add(newComp);
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
