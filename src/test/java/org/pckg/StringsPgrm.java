package org.pckg;

public class StringsPgrm {
	public static void main(String[] args) {
		String s1="Welcome to java programming"; 
		String s2="java " ;
		String s3="program";
		System.out.println(s2.trim());
		
		System.out.println(s1.startsWith("to"));
		
		System.out.println(s1.endsWith("java"));
		
		System.out.println(s1.substring(8));
		
		System.out.println(s1.substring(4,12));
		
		System.out.println(s2.replace(' ', '_'));
		
		System.out.println(s2.equals(s3));
		
		System.out.println(s2.compareTo(s3));
		
		System.out.println(s2+s3);	
	}

}
//
//
