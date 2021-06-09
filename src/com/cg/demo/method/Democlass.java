package com.cg.demo.method;

/*
 * access modifiers
 * private - can be accessed only from within the class
 * <package> or (default) - can be
 */
















public class Democlass {

		public int publicField = 10;
		protected int protectedField = 20;
		int packageField = 30;
		private int privateField = 40;
		
		public static void main(String[] args) {
			
			Democlass obj = new Democlass();
			System.out.println(obj.publicField);
			System.out.println(obj.protectedField);
			System.out.println(obj.packageField);
			System.out.println(obj.privateField);
			
			
		}
}
