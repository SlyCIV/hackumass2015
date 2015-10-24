public class Clause{
	IClauseComponent partA, partB;
	ICompOperator comp;
	
	public Clause(IClauseComponent partA, IClauseComponent partB, IClauseOperator comp){
		this.partA = partA;
		this.partB = partB;
		this.comp = comp;
	}
	
	public String toString(){
		String retval = "";
		retval += this.partA.toString();
		retval += this.comp.toString();
		retval += this.partB.toString();
		return retval;
	}
}