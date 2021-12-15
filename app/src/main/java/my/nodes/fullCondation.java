package my.nodes;

public class fullCondation extends Node {
String Operator;
    
	public String getOperator() {
		return Operator;
	}
	public void setOperator(String operator) {
		Operator = operator;
	}
	
	public fullCondation() {
    	this.name= new String("Condition");
    	
    }
	@Override
	public Object execute(context con) {
		if(children.size()<2) {
			return children.get(0).execute(con);
		}
		else {
			boolean r1=(Boolean)children.get(0).execute(con);
			boolean r2=(Boolean)children.get(1).execute(con);
			switch(Operator) {
			case "and": return r1 && r2;
			case "or":return r1 || r2;
			}
		}
	
 		return null;
	}

	@Override
	public Object compile(context con) {
		// TODO Auto-generated method stub
		return null;
	}

}
