package org.pckg;

public class MethodOverriding extends MethodOverLoading{
	@Override
	public void printMessage(){
		System.out.println("Overrided method");
		super.printMessage();
	}
	public static void main(String[] args) {
		MethodOverriding a=new MethodOverriding();
		a.printMessage();
	}
}
