package com.tnsif.Demo.Day8.Strings;

public class methodStrings {

	public static void main(String[] args) {
		String s = new String("hello world");
		String s1 = "HELLO WORLD";
		String s2 ="tns";
		
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.charAt(3));
		
		StringBuffer  sb = new StringBuffer("hello");
		StringBuffer sb1 = new StringBuffer("world");
		
		System.out.println(sb.equals(sb1));
	
		System.out.println(sb.equals(sb));

	}

}