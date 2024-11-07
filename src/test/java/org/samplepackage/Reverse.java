package org.samplepackage;

public class Reverse {
	public static void main(String[] args) {
		int n=12321,t;
		int sum=0;
		int temp=n;
		
		while(n>0) {
			t=n%10;
			sum=(sum*10)+t;
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("Paliondrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}

	}
}
/*n=345, sum=0;
 * 345>0==> T
 * t=345%10 => 5 
 * sum=(0*10)+5 =>0+5 =>5
 * n=345/10 => 34
 * 
 * 34>0 ==>T
 * t=34%10 => 4
 * sum=(5*10)+4 = > 50+4 => 54
 * n=34/10 => 3
 * 
 * 3>0 ==> T
 * t=3%10 ==> 3
 * sum=(54*10)+3=540+3
 * n=3/10 ==> 0
 * 
 * 0>0 ==> F
 * 
 */
