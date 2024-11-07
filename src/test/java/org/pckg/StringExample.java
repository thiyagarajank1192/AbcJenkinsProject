package org.pckg;

import java.awt.AWTException;
import java.awt.Robot;

public class StringExample {

	public static void main(String[] args) throws Exception {
		String s1="Java"; //--> Literal String
		String s2="WELCOME";
			
		String s3= new String("Welcome"); // ---> Non Literal String;
		String s4= new String(" Wel c ome ");
		
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s2));
//		System.out.println(System.identityHashCode(s3));
//		System.out.println(System.identityHashCode(s4));
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(200));
		
		Thread.sleep(10000);
		
		
		System.out.println(s1.toUpperCase());
					
		System.out.println(s2.toLowerCase());
		
		
		System.out.println(s1.indexOf('a'));
		
		System.out.println(s1.lastIndexOf('a'));
		
		System.out.println(s3.equals("welcome"));
		
		System.out.println(s3.equalsIgnoreCase("welcome"));
	}

}
