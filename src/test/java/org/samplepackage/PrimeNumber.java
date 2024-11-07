package org.samplepackage;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=16;
		boolean flag=true;
		if(n<3) {
			System.out.println("Not a valid number, please enter number greater than 3");
		}
		else {
			for(int i=2; i<=(n/2);i++) {
				if((n%i) == 0) {
					flag=false;
					break;	
				}					
			}
			if(flag) {
				System.out.println("It is a prime number");
			}
			else {
				System.out.println("it is not a prime number");
			}
		}
	}
}

/*
 * n=4, flag=true
 * i=2; 2<=3/2 2<=2 ==> T
 * 4%2 == 0 => T; flag=false
 * 
 * 
 */


