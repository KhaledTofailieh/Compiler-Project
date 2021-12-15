package my.nodes;

import android.content.Context;
import my.Fragments.setOutputInterface;

public class Write extends Node{
	public setOutputInterface mListener;
	public Write(Context android_context) {
		mListener=(setOutputInterface)android_context;
		this.name = new String("Write");
	}

	@Override
	public Object execute(context con) {
	//	System.out.println(children.get(0).execute(con));
		mListener.setText(children.get(0).execute(con).toString());
		return null;
	}
	@Override
	public Object compile(context con) {

		return "cout << " + children.get(0).compile(con) + " << endl;";
	}

}
