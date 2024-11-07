package org.pckg;

public class TestException {
	public static void main(String[] args) {
		try {
			throw new MyException();
		}catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
