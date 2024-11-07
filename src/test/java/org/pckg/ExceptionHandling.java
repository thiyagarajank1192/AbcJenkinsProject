package org.pckg;

import java.util.InputMismatchException;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("statement 1");
		try {
			int a=123/0;
		}catch (ArithmeticException e) {
			System.out.println("IndexOutOfBoundsException occurs");
		}catch (InputMismatchException e) {
			System.out.println("InputMismatchException occurs");
		}catch (Exception e) {
			System.out.println("aritmetic occurs");;
		}
		System.out.println("statement 6");
		
	}

}
