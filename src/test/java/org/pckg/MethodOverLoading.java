package org.pckg;

public class MethodOverLoading {
	int a=9;
	public void printMessage() {//called method
		System.out.println("Welcome to java programming");
	}
	private void printMessage(String n){
		System.out.println("Welcome: "+n);
	}
	private void printMessage(int n) {//type
		System.out.println("Age: "+n);
	}
	private void printMessage(int a, String n) {//count
		System.out.println("4.Name: "+n+" and Age: "+a);
	}
	private void printMessage(String a, int n) {//order
		System.out.println("5.Name: "+a+" and Age: "+n);
	}
	public static void main(String[] args) {
		MethodOverLoading o=new MethodOverLoading();
		o.printMessage(89);
		o.printMessage();//calling statement
		o.printMessage("kumar", 49);
		o.printMessage( 49,"dsjkfhsjk");
		
	}

}
