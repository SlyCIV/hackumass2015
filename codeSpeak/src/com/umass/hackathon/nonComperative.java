public class nonComperative extends Binary{
	
	public nonComperative(){
		super();
	}
	
	public String toString(){
		String retval = "";
		retval += this.partA;
		retval += this.operator;
		retval += this.partB;
		return retval;
	}
}