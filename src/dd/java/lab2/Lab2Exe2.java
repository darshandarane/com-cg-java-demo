 package dd.java.lab2;

import java.util.Scanner;

public class Lab2Exe2 {

	static void sortStrings(String[] arr, int n) {
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k = 0; k < n / 2; k++) {
			System.out.println(arr[k].toUpperCase());
		}
		for (int k = n / 2; k < n; k++) {
			System.out.println(arr[k].toLowerCase());
		}
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = Sc.nextInt();

		String[] arr1 = new String[size];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Please Enter String in the array at position" + i);
			arr1[i] = Sc.next();
		}
		sortStrings(arr1, size);
		System.out.println("HEllo User");
	}
}
