package my.nodes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
//import java.util.Stack;

public class context {
	HashMap<String,Object> vars =new HashMap<>();
	public HashMap<String,Object> getVars() {
		return vars;
	}
	Deque<HashMap<String,Object>> Tabel=new ArrayDeque<>(); 
	
	Deque<HashMap<String,Object>> FunTabel=new ArrayDeque<>();
	
	public void addScope() {
		Tabel.push(vars);
		vars = new HashMap<String, Object>();
	}
	
	public void removeScope() {
		vars = Tabel.pop();
	}
	public void addFunScope() {
		FunTabel.push( new HashMap<String, Object>());
	}
	
	public void removeFunScope() {
	    FunTabel.pop();
	}
	
	public Object CheckVar(String name) {
		for ( HashMap<String,Object> c:Tabel) {
			if(c.containsKey(name)) return c.get(name);
		}
		return null;
	}
	public void updateTabel(String name,Object value) {
		for (HashMap<String,Object> c:Tabel) {
			if(c.containsKey(name)) c.put(name, value);
		}
	}
	public Object CheckFunVar(String name) {
		for ( HashMap<String,Object> c:FunTabel) {
			if(c.containsKey(name)) return c.get(name);
		}
		return null;
	}
	public void updateFunTabel(String name,Object value) {
		for (HashMap<String,Object> c:FunTabel) {
			if(c.containsKey(name)) c.put(name, value);
		}
	}
}
