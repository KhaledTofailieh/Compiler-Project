package my.nodes;

public class Expreation extends Node{
	String Operator;

	public String getOperator() {
		return Operator;
	}
	public void setOperator(String operator) {
		Operator = operator;
	}
	public Expreation() {
		this.name =new String("Expreation");
	}
	@Override
	public Object execute(context con) {
		Object d0= children.get(0).execute(con);
		Object d3= children.get(1).execute(con);
		
		if(d0 instanceof String || d3 instanceof String) {
			switch(Operator) {
			case "+": return d0.toString().concat(d3.toString());
			default:
				throw new wrongOperator(Operator);
			}
		}
		else if(d0 instanceof Integer && d3 instanceof Integer) {
			int d1=(Integer) d0;
			int d2=(Integer) d3;
			switch(Operator) {
			case "+":return d1+d2;
			case "-":return d1-d2;
			case "*":return d1*d2;
			case "/":return d1/d2;
			case "%":return d1%d2;
			case "^":return Math.pow(d1, d2);
			}
		}
			
		 double d1=Double.valueOf(d0.toString());
		 double d2=Double.valueOf(d3.toString());
		 switch(Operator) {
		 	case "+":return d1+d2;
		 	case "-":return d1-d2;
		 	case "*":return d1*d2;
		 	case "/":return d1/d2;
		 	case "%":return d1%d2;
		 	case "^":return Math.pow(d1, d2);
		 }
	   
		return null;
	}

	@Override
	public Object compile(context con) {
		return children.get(0).compile(con) + Operator
				+ children.get(1).compile(con);
	}

}
