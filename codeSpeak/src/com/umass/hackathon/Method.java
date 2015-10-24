package com.umass.hackathon;
import java.util.*;

public class Method implements IClassComponent {
	// fields
	String name;
	String type;
	String input;
	ArrayList<IBodyPart> body;
	
	public Method(String[] s) {
		parts = new ArrayList<IBodyPart>();
		
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("called")) {
				this.name = s[++i];
			} else if (s[i].equals("type")) {
				this.type = s[++i];
			} else if (s[i].equals("input")) {
				input = getInput(Arrays.copyOfRange(s, i + 1, s.length));
			}
		}
	}
	
	public String getInput(String[] s) {
		String temp = "";
		int i = 0;
		
		if (s[i].equals("of")) {i++;}

		for (int j = i; j < s.length - 1; j+=2) {
			String type = s[j];
			String name = s[j+1];
			
			if (type.toLowerCase().equals("integer")) {
				type = "int";
			}
			
			Variable newVar = new Variable(name, type);
			temp += newVar.toString();
			if (j < s.length - 2) {
				temp += ", ";
			}
		}
		return temp;
	}
	
	public void addComponent(String[] s) {
		IBodyPart newComp = null;
		
		int i;
		for (i = 0; i < s.length; i++) {
			if (s[i].equals("variable")) {
				newComp = new Variable( Arrays.copyOfRange(s, ++i, s.length - 1) );
				break;
			} else if (s[i].equals("return") || s[i].equals("returns")) {
				
			}
		}
		
		if (newComp != null) {
			this.body.add(newComp);
		}
	}
	
	
	public void print() {
		System.out.println("public " + this.type + " " + this.name + " (" + this.input + ") {");
		for (int i = 0; i < body.size(); i++) {
			this.body.get(i).print();
		}
		System.out.println("}");
	}
}
