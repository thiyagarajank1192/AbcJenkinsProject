package org.samplepackage;

public class MinOfArray {
	public static void main(String[] args) {
		int a[]= {561,872,211,123,6,0};
		int m=a[0];
		
		for (int e : a) {
			if(m>e) {
				m=e;
			}	
		}
		System.out.println(m);
	}
}

/* m=561
 * e=561 => 561>561 => F 
 * e=872 => 561>872 => F
 * e=211 => 561>211 => T => m=211;
 * e=123 => 211>123 => T => m=123;
 * e=6   => 123>6   => T => m=6;
 */
