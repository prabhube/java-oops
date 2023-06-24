package org.string;

public class StringOne {
	public static void main(String[] args) {
		String s="HAI prabhu";
		System.out.println("before string :"+s);
		System.out.println("output :"+s.length());
		String[] split = s.split(" ");
		System.out.println("output of sring length :"+split.length);
		System.out.println("index of char :"+s.indexOf('h'));
		System.out.println("last index of string : "+s.lastIndexOf('b'));
		System.out.println("character of integer: "+s.charAt(7));
		System.out.println("start with string:"+s.startsWith("h"));
		System.out.println("end with string:"+s.endsWith("u"));
		System.out.println("lowercase of string: "+s.toLowerCase());
		System.out.println("uppercase of string: "+s.toUpperCase());
		System.out.println("after sub string: "+s.substring(6));
		System.out.println("after sub string: "+s.substring(0, 8));
		System.out.println(" trim of string : "+s.trim());
		System.out.println("replace of string: "+s.replace('h','n'));
	}
}
