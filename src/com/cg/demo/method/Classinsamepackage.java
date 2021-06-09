package com.cg.demo.method;

public class Classinsamepackage {

	public static void main(String[] args) {

		Democlass obj = new Democlass();
		System.out.println(obj.publicField);
		System.out.println(obj.protectedField);
		System.out.println(obj.packageField);
		System.out.println(obj.privateField);
		System.out.println(obj.num);
	}
}