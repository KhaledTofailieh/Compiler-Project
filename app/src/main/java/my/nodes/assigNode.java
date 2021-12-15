package my.nodes;

public class assigNode extends Node{
	private String varName;
	
	public assigNode() {
		this.name=new String("Assign");
	}
	
	@Override
	public Object execute(context con) {
	if(con.FunTabel.isEmpty()) {	
		if( !con.getVars().containsKey(varName) && con.CheckVar(varName)==null) {
			con.getVars().put(varName, children.get(0).execute(con));
		}
		else if(!con.getVars().containsKey(varName) && con.CheckVar(varName)!=null) {
			Object type= con.CheckVar(varName);
			Object res= children.get(0).execute(con);
			if((type instanceof String && res instanceof String ) || (type instanceof Double && res instanceof Double )||(type instanceof Integer && res instanceof Integer )){
				con.updateTabel(varName, res);
			}
			else {
				throw new contChangType(varName);
			}
		}
		else {
			Object type= con.getVars().get(varName);
			Object res= children.get(0).execute(con);
			if((type instanceof String && res instanceof String ) || (type instanceof Double && res instanceof Double )||(type instanceof Integer && res instanceof Integer )){
				con.getVars().put(varName, res);
			}
			else {
				throw new contChangType(varName);
			}
		}
	}else {
		if(con.CheckFunVar(varName)==null) {
			con.FunTabel.peek().put(varName, children.get(0).execute(con));
		}
		else if(con.CheckFunVar(varName)!=null) {
			Object type= con.CheckFunVar(varName);
			Object res= children.get(0).execute(con);
			if((type instanceof String && res instanceof String ) || (type instanceof Double && res instanceof Double )||(type instanceof Integer && res instanceof Integer )){
				con.updateFunTabel(varName, res);
			}
			else {
				throw new contChangType(varName);
			}
		}
		
	}
     return 0;
	}

	
	@Override
	public Object compile(context con) {
		return varName + "=" + children.get(0).compile(con) + ";";
	}

	public String getVarName() {
		return varName;
	}

	public void setVarName(String varName) {
		this.varName = varName;
	}

}
