package org.string;

public class StringBufferOne {
	public static void main(String[] args) {
		String s="hai prabhu";
		s.toUpperCase();
		System.out.println(s);
		String r="hai prabhu";
		r.concat(s);
		
		r="bye";
		System.out.println(r);
	}
}
