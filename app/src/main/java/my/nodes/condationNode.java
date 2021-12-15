package my.nodes;


public class condationNode extends Node{
    String Operator;
    
	public String getOperator() {
		return Operator;
	}
	public void setOperator(String operator) {
		Operator = operator;
	}
	
	public condationNode() {
    	this.name= new String("Condation");
    	
    }
	@Override
	public Object execute(context con) {
		Object d0= children.get(0).execute(con);
		Object d3= children.get(1).execute(con);
		if(d0 instanceof String && d3 instanceof String) {
			int t=d0.toString().compareToIgnoreCase(d3.toString());
			switch(Operator) {
			case ">":if(t==1)return true;else return false;
			case "<":if(t==-1)return true;else return false;
			case "=":if(t==0)return true;else return false;
			case "!=":if(t==1)return false;else return true;
			}
		}
		else if(d0 instanceof Integer && d3 instanceof Integer) {
			int d1=(Integer) d0;
			int d2=(Integer)d1;
			switch(Operator) {
			case ">":return d1>d2;
			case "<":return d1<d2;
			case "=":return d1==d2;
			case "!=":return d1!=d2;
			case "<>": return d1!=d2;
			}
	 	
		}
		else if((d0 instanceof Double && d3 instanceof Double) ||(d0 instanceof Double && d3 instanceof Integer) ||(d0 instanceof Integer && d3 instanceof Double)) {
		double d1=Double.valueOf(d0.toString());
		double d2=Double.valueOf(d3.toString());
			switch(Operator) {
				case ">":return d1>d2;
				case "<":return d1<d2;
				case "=":return d1==d2;
				case "!=":return d1!=d2;
				case "<>": return d1!=d2;
			}
		}
		else {
			throw new contCompareObjectFromdiffrentType();
		}
 		return null;
	}

	@Override
	public Object compile(context con) {
		String op = Operator;
		if (op.equals("="))
			op = "==";
		if (op.equals("<>"))
			op = "!=";
		return children.get(0).compile(con) + op
				+ children.get(1).compile(con);
	}

}
