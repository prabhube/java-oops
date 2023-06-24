package org.abstraction;

public class Abstractchild extends AbstractOne {

 @Override
	public void sbi() {
		System.out.println("7%");
	}
 public static void main(String[] args) {
	Abstractchild a=new Abstractchild();
	a.indanbank();
	a.sbi();
}
 
}
