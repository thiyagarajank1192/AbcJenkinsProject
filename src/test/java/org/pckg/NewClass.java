package org.pckg;

public class NewClass extends AbsClass{

	@Override
	public void methodOne() {
		System.out.println("Helo from child class");
	}
	public static void main(String[] args) {
		NewClass n= new NewClass();
		n.methodOne();
		n.printMessage();
	}

}
