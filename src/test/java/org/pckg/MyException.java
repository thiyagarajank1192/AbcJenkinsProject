package org.pckg;

public class MyException extends Exception{
	@Override
	public String getMessage() {
		String s="Custom/user defined exception";
		return s;
	}

}
