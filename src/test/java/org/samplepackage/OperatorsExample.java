package org.samplepackage;

public class OperatorsExample {

	public static void main(String[] args) {
		//unary operators
//		boolean a= false;
//		
//		boolean b=true;
//		
//		System.out.println(a);
//		System.out.println(!b);
		
		//Pre or post increment
		
		int a=89;
		System.out.println("a= "+a);
		int b=a--;
		System.exit(0);
		System.out.println("After post increment");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		System.out.println();
		a=89;
		System.out.println("a= "+a);
		b=--a;
		System.out.println("After pre increment");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		
	}

}
