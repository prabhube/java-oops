package org.inheritence;

public class MultilevelThree extends MultilevelTwo {
	public void three() {
		System.out.println("three");
	}
	public static void main(String[] args) {
		MultilevelThree m=new MultilevelThree();
		m.one();
		m.two();
		m.three();
	}
}
