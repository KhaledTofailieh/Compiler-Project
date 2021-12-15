package my.nodes;


public class whileNode extends Node {
	public whileNode() {
		this.name = new String("While");
	}

	@Override
	public Object execute(context con) {
		if(con.FunTabel.isEmpty()) {
		con.addScope();
		while((boolean)children.get(0).execute(con)) {
			children.get(1).execute(con);
			
		}
		con.removeScope();
		return null;
		}else {
		
			con.addFunScope();
			while((boolean)children.get(0).execute(con)) {
				children.get(1).execute(con);
				
			}
			con.removeFunScope();
			return null;
		}
	}

	@Override
	public Object compile(context con) {
		return "while(" + children.get(0).compile(con)
				+ "){" + children.get(1).compile(con) + "}";
	}

}
