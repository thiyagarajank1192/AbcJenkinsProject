package org.samplepackage;

public class OddOrEven {
	public static void main(String[] args) {
		int n=88;
		if((n%5)==0) {
			if((n%2)==0) { //nested if
				System.out.println("the number is divisible by 2 and 5");
			}
			else {
				System.out.println("the numer is not divisible by 5");
			}
		}
		else {
			System.out.println("the numer is not divisible by 2");
		}
		

	}

}
