package org.samplepackage;

public class ArrayExample {
	public static void main(String[] args) {
		int a[]=new int[5];// int a;
				
		int b[]= {34,56,7,45};//int a=90;
		
		a[0]=89;
		a[4]=89;
		a[1]=77;
		a[2]=89;
		a[3]=22;
			
		for(int i=0;i<a.length;i++) { //for loop
			System.out.println(a[0]+", ");
		}
		
		System.out.println();
		
		for(int i=a.length-1;i>=0;i--) { //for loop
			System.out.println(a[i]+", ");
		}
		System.out.println();
		
		for(int t : b) {//enchanced for loop(foreach)
			System.out.println(t);
		}

	}

}
