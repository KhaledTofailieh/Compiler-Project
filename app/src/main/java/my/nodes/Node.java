package my.nodes;

import java.util.ArrayList;

public abstract  class Node {

 protected String name;
 protected boolean visited=false;
 
 public boolean isVisited() {
	return visited;
}
public void setVisited() {
	this.visited = true;
}
public ArrayList<Node> getChildren() {
	return children;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

ArrayList<Node> children =new ArrayList<>();

public void addChildren(Node n) {
	 children.add(n);
 }
 public abstract Object execute(context con);
 public abstract Object compile(context con);
	
 
 public void DFS(String s) {
	 System.out.println(s+this.getName());
	 for(Node c : children) {
		c.DFS(s+"---");
	 }
 }

}
