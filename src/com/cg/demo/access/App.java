package com.cg.demo.access;

import com.cg.demo.method.Democlass;
//import com.cg.demo.method.Democlass;
//import com.cg.demo.method.Employee;


public class App {

	public static void main(String[] args) {
		
		Democlass obj = new Democlass();
		System.out.println(obj.publicField);
//		System.out.println(obj.protectedField);
//		System.out.println(obj.packageField);
//		System.out.println(obj.privateField);
//		//System.out.println(obj.num);
		
		//FQN - Fully qualified name of class
		
		com.cg.demo.method.Employee emp =  new com.cg.demo.method.Employee();
		com.cg.demo.pc2.Employee emp2 = new com.cg.demo.pc2.Employee();
		
		
		12
}
}
