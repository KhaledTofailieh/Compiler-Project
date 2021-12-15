package my.nodes;


import android.os.Build;
import android.support.annotation.RequiresApi;

public class BlockNode extends Node {

	
	public BlockNode() {
		this.name =new String("Block");
	}

	@Override
	public Object execute(context con) {
		for(Node c: children) {
			c.execute(con);
		}
		return null;
	}

	@RequiresApi(api = Build.VERSION_CODES.O)
	@Override
	public Object compile(context con) {
		StringBuilder res = new StringBuilder();
		for(int i=0;i<children.size();i++)
			res.append ((String)children.get(i).compile(con));
		return res.toString();
	}

}
