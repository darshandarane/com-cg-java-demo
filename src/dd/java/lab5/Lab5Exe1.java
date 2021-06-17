package dd.java.lab5;

import java.util.Scanner;

class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyException(String S) {
		super(S);
	}
}

public class Lab5Exe1 {
	public static void validate(int age) throws MyException {
		if (age < 15) {
			throw new MyException("Age of person should be greater than 15 ...");
		} else {
			System.out.println("You are welcome");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of person :- ");
		int age = sc.nextInt();
		try {
			validate(age);
		}

		catch (MyException me) {
			System.out.println("Excpetion Occured" + me.getMessage());
			sc.close();
		}
	}
}
