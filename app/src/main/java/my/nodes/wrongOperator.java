package my.nodes;

public class wrongOperator extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String Operator; 
	public wrongOperator(String oper) {
		this.Operator=oper;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage()+" Error you can't use this Operator "+ Operator+" with String";
	}
	
	
}
