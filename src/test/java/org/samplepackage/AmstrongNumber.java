package org.samplepackage;

public class AmstrongNumber {
		public static void main(String[] args) {
			int n=345,t;
			int sum=0;
			int temp=n;
			
			while(n>0) {
				t=n%10;
				sum=sum+(t*t*t);
				n=n/10;
			}
			
			if(temp==sum) {
				System.out.println("Amstrong number");
			}
			else {
				System.out.println("not an Amstrong number");
			}
				

		}
	}
