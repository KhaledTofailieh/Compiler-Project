package my.nodes;

import java.util.HashMap;

public class FunctionCall extends Expreation {
	
String functionName;
	
	HashMap<String, FunctionNode> functions = new HashMap<String, FunctionNode>();
	
	
	
	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public HashMap<String, FunctionNode> getFunctions() {
		return functions;
	}

	public void setFunctions(HashMap<String, FunctionNode> functions) {
		this.functions = functions;
	}

@Override
	public Object execute(context con) {
	if (!functions.containsKey(functionName))
		throw new RuntimeException("Function not Found");
	FunctionNode f = functions.get(functionName);
	if (f.getParams().size() != this.children.size())
		throw new RuntimeException("Invalid parameters Number");
	HashMap<String, Object> tmp = new HashMap<String, Object>();
	for(int i=0;i<f.getParams().size();i++)
		tmp.put(f.getParams().get(i), this.getChildren().get(i).execute(con));
	con.addFunScope();
	con.FunTabel.peek().putAll(tmp);
	f.root.execute(con);
	Object res =con.FunTabel.peek().get("ret");
	con.removeFunScope();
	return res;

	}
	@Override
	public Object compile(context con) {
		StringBuilder res=new StringBuilder(functionName+"(");
		FunctionNode f=functions.get(functionName);
		res.append(f.getParams().get(0));
		for (int i=1;i<f.getParams().size();i++){
			res.append(","+f.getParams().get(i));
		}
		res.append(");");
		return res;
	} 

	
}
