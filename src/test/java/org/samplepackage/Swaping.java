package org.samplepackage;
//Swapping using third variable.
public class Swaping {
	public static void main(String[] args) {
		int n1=23,n2=89;
		int temp;
		System.out.println("Values before swapping: "+n1+ " and "+n2 );
		
		temp=n1;
		n1=n2;
		n2=temp;
		
		System.out.println("Values after swapping: "+n1+ " and "+n2 );
	}

}
