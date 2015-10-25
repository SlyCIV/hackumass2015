package com.umass.hackathon;
import java.lang.*;

public class TestHierarchy {

	public static void main(String[] args) {
		String s = "if a plus b equals c and invert b";
		PrgmControlStructure test = new PrgmControlStructure( s.split(" ") );
		test.printBodyPart();
	}

}
