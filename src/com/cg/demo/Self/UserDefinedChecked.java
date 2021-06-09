package com.cg.demo.Self;

class UnderAgeException extends Exception {
	UnderAgeException() {
		super("You Are under age ");

	}

	UnderAgeException(String message) {
		super(message);
	}
}


public class UserDefinedChecked  {
	public static void main(String[] args) throws UnderAgeException {
		int age =20;

		if (age < 18) {
			throw new UnderAgeException();
		}
		else {
			System.out.println("You Can vote Now");
		}
	}

}
