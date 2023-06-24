package org.polymorpishm;

public class MethodOverloading {
	public void company(String name) {
		System.out.println(name);
	}
	public void company(int id, String name) {
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		MethodOverloading a=new MethodOverloading();
		a.company("inspirisys");
		a.company(100812, "inspirisys");
	}
}
