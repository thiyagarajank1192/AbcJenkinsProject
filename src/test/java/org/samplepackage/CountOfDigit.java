//count of the digit program
package org.samplepackage;

public class CountOfDigit {

	public static void main(String[] args) {
		int n=145;
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		System.out.println(count);

	}

}

/*count =1
 * n=345/10 => n=34
 * 
 * count =2
 * n=34/10 n=3;
 * 
 *  count=3
 *  n=3/10 n=0
 *  
 *  n=n/10
 */