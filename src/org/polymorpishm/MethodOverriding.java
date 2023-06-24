package org.polymorpishm;

public class MethodOverriding extends MethodOverridding {
	@Override
	public void company(String name) {
		System.out.println(name);
	}
	@Override
	public void company() {
	System.out.println("infotech");
	super.company();
	}
	public static void main(String[] args) {
		MethodOverriding n=new MethodOverriding();
		n.company();
		n.company("inspirisys");
	}
	
}
