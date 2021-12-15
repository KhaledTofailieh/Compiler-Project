package my.nodes;

public class Var extends Expreation {
	
	private String var;
	
	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public Var() {
		this.name=new String("Var");
	}

	@Override
	public Object execute(context con) {
		if(con.FunTabel.isEmpty()) {
		if (con.getVars().containsKey(var))
			return con.getVars().get(var);
		else if(con.CheckVar(var)!=null) {
			return con.CheckVar(var);
		}
		else {
			throw new  VariableDosenotExect(var);
			
		 }
		}else {
			 if(con.CheckFunVar(var)!=null) {
				return con.CheckFunVar(var);
			}
			else {
				throw new  VariableDosenotExect(var);
				
			 }	
		}
	}

	@Override
	public Object compile(context con) {
		return var+"";
	}

}
