package com.umass.hackathon;
import java.util.*;

public class PrgmControlStructure implements IBodyPart {

	ControlStructureMode mode;
	IClauseComponent[] clauses;
	ArrayList<IBodyPart> body; 
	
	PrgmControlStructure(String[] s) {
		
	}
	
	public static IClauseComponent makeIClause(String[] s) {
		switch (s[0].toLowerCase()) {
		  case "if":
		  case "else-if":
		  case "else":
		  case "while":
			  
		
		
		
		}
		
		
		
		return null;
	}
	
	
	public void printBodyPart() {
		
	}
}
