package org.samplepackage;

import java.util.Arrays;

public class AscendingOrder {
	public static void main(String[] args) {
		int a[]= {561,872,211,123,6};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
