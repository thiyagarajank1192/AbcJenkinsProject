package org.samplepackage;

public class SumOfDigit {
	public static void main(String[] args) {
		int n=345,t;
		int sum=0;
		while(n>0) {
			t=n%10;
			sum=sum+t;
			n=n/10;
		}
		System.out.println(sum);

	}
}
/*n=345, sum=0;
 * 345>0==> T
 * t=345%10 => 5 
 * sum=0+5 => 5
 * n=345/10 => 34
 * 
 * 34>0 ==>T
 * t=34%10 => 4
 * sum=5+4 = > 9
 * n=34/10 => 3
 * 
 * 3>0 ==> T
 * t=3%10 ==> 3
 * sum=9+3=12
 * n=3/10 ==> 0
 * 
 * 0>0 ==> F
 * 
 */
