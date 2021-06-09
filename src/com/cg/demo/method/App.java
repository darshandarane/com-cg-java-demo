package com.cg.demo.method;

public class App {
   public static void main(String[] args) {
	int num = 10;
	
	Employee obj = new Employee();
	obj.id = 101;
	obj.name = "ABHD" ;
	obj.salary = 10.65;
	System.out.println(obj.toString());
	
	Employee obj2 = new Employee();
	obj.id = 102;
	obj.name = "Abc" ;
	obj.salary = 1015;
	System.out.println(obj.toString());
	
	Employee obj3 = new Employee();
	obj.id = 103;
	obj.name = "Abcd" ;
	obj.salary = 1054;
	System.out.println(obj.toString());
	
	Employee obj4 = new Employee(104, "dgah", 456);
	System.out.println(obj4.toString());
	
	Employee obj5 = new Employee(11025, "dhjfg", 86);
	System.out.println(obj5.toString());
	
	Employee obj6 = new Employee(104, "ituyi");
	System.out.println(obj6.toString());
	
}
}