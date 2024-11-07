package org.samplepackage;

public class Sum {
	public static void main(String[] args) {
		int n=5,sum=1;
		for (int i = 1; i <= n; i++) {
			sum=sum+i;		
		}
		System.out.println("factorial = "+sum);
	}
}
/* Iteration
 * sum=0, n=5
 * i=1; 1<=5 == T
 * sum=0+1= 1 => sum=1
 *  
 * i=2; 2<=5 == T
 * sum=1+2=3 => sum=3
 *  
 * i=3; 3<=5 == T
 * sum =3+3=6 => sum=6
 * 
 * i=4; 4<=5 == T
 * sum =6+4=10 =>sum=10
 * 
 * i=5; 5<=5 == T
 * sum =10+5=15 =>sum=15
 * 
 * i=6;6<=5 == F
 */