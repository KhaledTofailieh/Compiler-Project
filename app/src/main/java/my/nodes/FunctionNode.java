package my.nodes;

import java.util.ArrayList;


public class FunctionNode extends Node {

	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public ArrayList<String> getParams() {
		return params;
	}
	ArrayList<String> params = new ArrayList<String>();
	Node root;

	@Override
	public Object execute(context con) {
		return null;
	}

	@Override
	public Object compile(context con) {
		StringBuilder res=new StringBuilder(name+"(");
		for (int i=1;i<params.size();i++){
			res.append(","+params.get(i));
		}
		res.append("){");
		res.append(root.compile(con));
		res.append("}");
		return res;
	}
}
