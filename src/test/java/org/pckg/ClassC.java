package org.pckg;

public class ClassC{

	public static void main(String[] args) {
		String s1="Welcome";
		String s2="Welcome";
		String s3=new String("Java");
		String s4=new String("Java");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
	}

}
