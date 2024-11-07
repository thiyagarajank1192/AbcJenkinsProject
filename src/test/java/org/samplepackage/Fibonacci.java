package org.samplepackage;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		int n=10;
		int sum;
		for (int i = 0; i < n-2; i++) {
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
		
	}
}
/*
 * a=0, b=1 ==> print a, b
 * i=0; 0<3 ==> T
 * sum=0+1 = 1 ==> sum=1 ==> print sum
 * a=1;
 * b=1
 * 
 * i=1 1<3 ==> T
 * sum=1+1=2 ==> sum=2 ==> print sum
 * a=1
 * b=2
 * 
 * i=2 2<3 ==> T
 * sum=1+2=3 sum=3 print sum
 * a=2
 * b=3
 * 
 * i=3 3<3 ==> F
 */
