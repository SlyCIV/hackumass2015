package com.umass.hackathon;
import java.lang.*;

public class TestHierarchy {

	public static void main(String[] args) {
		String s = "create a class called Batman";
		Class testClass = new Class( s.split(" "));
		
		s = "Within Batman, create a variable of type int called morgan with the value 10";
		testClass.addComponent(s.split(" "));
		
		s = "Within Batman, create a method called mystery of type int with input of integer n int rest double batman";
		testClass.addComponent(s.split(" "));
		
		
		testClass.print();
	}

}
