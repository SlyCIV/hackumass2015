public class Comperative extends Binary{
	
	public Comperative(){
		super();
	}
	
	public String toString(){
		String retval = "";
		retval += this.partA.toString();
		retval += this.operator.toString();
		retval += this.partB.toString();
		return retval;
	}
}