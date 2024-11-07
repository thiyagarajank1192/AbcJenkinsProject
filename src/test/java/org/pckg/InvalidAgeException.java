package org.pckg;

public class InvalidAgeException extends Exception{
	@Override
	public String getMessage() {
		String msg="Age is not valid";
		return msg;
	}
}
