package org.samplepackage;

public class OperatorsTwo {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c=89;
		System.out.println("c= "+c);
		int d=a++;
		System.out.println("After post increment");
		System.out.println("c= "+c);
		System.out.println("d= "+d);
		
		
		//arithmentic operator
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		System.out.println("Modulos: "+(a%b));
		
		
		//Relational operator
		System.out.println(a>b);

	}

}
