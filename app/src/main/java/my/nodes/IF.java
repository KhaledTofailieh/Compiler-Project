package my.nodes;

public class IF extends Node {

	public IF() {
		this.name=new String("IF_Statment");
	}
	@Override
	public Object execute(context con) {
		if((Boolean)children.get(0).execute(con)) {
			children.get(1).execute(con);
		}
		else if(children.size()>2){
			children.get(2).execute(con);
		}
		return null;
	}

	@Override
	public Object compile(context con) {

		return "if(" + children.get(0).compile(con) + "){"
				+ children.get(1).compile(con) +
				"}" + (children.size() > 2? "else{" + children.get(2).compile(con) + "}" : "");
	}

}
