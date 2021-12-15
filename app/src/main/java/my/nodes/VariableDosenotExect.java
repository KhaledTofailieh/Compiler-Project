package my.nodes;

public class VariableDosenotExect extends RuntimeException {

	/**
	 * 
	 */
	String var;
	public VariableDosenotExect(String var) {
		this.var=var;
	}
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage()+"Error variable '"+ this.var +"' doesn't exist.";
	}

	
}
