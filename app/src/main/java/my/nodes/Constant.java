package my.nodes;

public class Constant extends Expreation{
 	private  Object valu;
	
	public Object getValue() {
		
		return valu;
		
		
	}

	public void setValue(Object valu) {
		this.valu = valu;
	}

	public Constant() {
		this.name=new String("Constant");
	}

		@Override
	public Object execute(context con) {
		return valu;
		
	}
		

	@Override
	public Object compile(context con) {
		return valu + "";
	}
	
}
