package my.nodes;

public class FOR extends Node {

	String VarName;
	
	public String getVarName() {
		return VarName;
	}
	public void setVarName(String varName) {
		VarName = varName;
	}
	public FOR() {
		this.name =new String("For");
	}
	@Override
	public Object execute(context con) {
		if(con.FunTabel.isEmpty()) {
		con.addScope();
		double start= Double.valueOf( children.get(0).execute(con).toString());
		double end=Double.valueOf( children.get(1).execute(con).toString());
		double step=1;
		if(children.size()>3) {
			step=Double.valueOf( children.get(3).execute(con).toString());
		}
		double current=start;
		while(true) {
			if(step<0 && current<end) { break;}
			if(step>0 && current>end) { break;}
			con.getVars().put(VarName, current);
			children.get(2).execute(con);
			end=Double.valueOf( children.get(1).execute(con).toString());
			if(children.size()>3) {
				step=Double.valueOf( children.get(3).execute(con).toString());
			}
			current += step;
		}
		con.removeScope();
		}else {
		
			con.addFunScope();
			double start=Double.valueOf( children.get(0).execute(con).toString());
			double end=Double.valueOf( children.get(1).execute(con).toString());
			double step=1;
			if(children.size()>3) {
				step=Double.valueOf( children.get(3).execute(con).toString());
			}
			double current=start;
			while(true) {
				if(step<0 && current<end) { break;}
				if(step>0 && current>end) { break;}
				con.FunTabel.peek().put(VarName, current);
				children.get(2).execute(con);
				end=Double.valueOf( children.get(1).execute(con).toString());
				if(children.size()>3) {
					step=Double.valueOf( children.get(3).execute(con).toString());
				}
				current += step;
			}
			con.removeFunScope();
			
		}
		return null;

	}

	@Override
	public Object compile(context con) {
		return "for(" + VarName + "=" + children.get(0).compile(con)
				+";" + VarName + "<=" + children.get(1).compile(con)
				+ ";" + VarName + "+=" + (children.size() > 3? children.get(3).compile(con) : "1")
				+ ")\r\n{" + children.get(2).compile(con) + "}" ;
	}

}
