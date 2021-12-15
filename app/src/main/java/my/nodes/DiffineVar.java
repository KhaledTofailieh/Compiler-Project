package my.nodes;

public class DiffineVar extends Node{
	String name,type;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Object execute(context con) {
		if(con.FunTabel.isEmpty()) {
		if(con.getVars().containsKey(name)) {
			Object tmp =con.getVars().get(name);
			if((tmp instanceof String && !type.equals("string")) ||(tmp instanceof Double && !type.equals("double"))||(tmp instanceof Integer && !type.equals("int")))
				throw new prediffiendVarible(name);
		}
		switch(type) {
		case "int":con.getVars().put(name,new Integer(0));break;
		case "double":con.getVars().put(name,new Double(0));break;
		case "string":con.getVars().put(name, new String());break;
		}
		}
		else {
			if(con.FunTabel.peek().containsKey(name)){
				throw new prediffiendVarible(name);
			}
			switch(type) {
			case "int":con.FunTabel.peek().put(name,new Integer(0));break;
			case "double":con.FunTabel.peek().put(name,new Double(0));break;
			case "string":con.FunTabel.peek().put(name, new String());break;
			}
			
		}
		return 0;
	}

	@Override
	public Object compile(context con) {
		// TODO Auto-generated method stub
		return type+name;
	}

}
