package org.samplepackage;

public class Student {
	String name;//Global variable
	int age;
	
	public void printName() {
		System.out.println("Name is: " +name);	
		
	}
	private void printAge() {
		int a;//Local Variable
		System.out.println("Age is: " +age);
	}
	public static void main(String[] args) {
		Student kumar=new Student();
		kumar.name="Kumar";
		kumar.age=45;
		kumar.printName();
		kumar.printAge();
		
		Student karthick=new Student();
		karthick.printAge();
	}

}
