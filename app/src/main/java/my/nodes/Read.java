package my.nodes;

import java.util.Scanner;

public class Read extends Node {
	private String Var;
	
	public String getVar() {
		return Var;
	}

	public void setVar(String var) {
		Var = var;
	}

	public Read() {
		this.name = new String("Read");
	}

	@SuppressWarnings("resource")
	@Override
	public Object execute(context con) {
		Scanner input =new Scanner(System.in);

		if(con.FunTabel.isEmpty()) {
			if(!con.getVars().containsKey(Var) && con.CheckVar(Var)==null) {
				con.getVars().put(Var, input.next());
			}
			else if(!con.getVars().containsKey(Var) && con.CheckVar(Var)!=null) {
				Object type= con.CheckVar(Var);
				if(type instanceof String)
					con.updateTabel(Var, input.next());
				else if(type instanceof Integer)
					con.updateTabel(Var, input.nextInt());
				else con.updateTabel(Var, input.nextDouble());
			}
			else {
				Object type= con.getVars().get(Var);
				if(type instanceof String)
					con.getVars().put(Var, input.next());
				else if(type instanceof Integer)
					con.getVars().put(Var, input.nextInt());
				else con.getVars().put(Var, input.nextDouble());
			}
		}
		else {
			if(con.CheckFunVar(Var)==null) {
				con.FunTabel.peek().put(Var, input.next());
			}else {
				Object type=con.CheckFunVar(Var);
				if(type instanceof String)
					con.updateFunTabel(Var, input.next());
				else if(type instanceof Integer)
					con.updateFunTabel(Var, input.nextInt());
				else con.updateFunTabel(Var, input.nextDouble());
			}
		}
		return null;
	}

	@Override
	public Object compile(context con) {
		return "cin >> " + Var + ";";
	}

}
