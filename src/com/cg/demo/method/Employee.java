package com.cg.demo.method;

/*
 * Constructor
 * used to create and initialize object
 * special type of method in java
 * does not have any return type
 * by default, java provides one default constructor
 * constructor name is same as class name
 * we can create our own constructor
 * if we create 
 * 
 */





public class Employee {

 int id; 
 String name; 
 double salary;
 
 Employee() {
	 
	  System.out.println("default constructor");
}
 	Employee(int id, String name){
	 this.id = id;
	 this.name = name;
	 
	  System.out.println(" two parameterised constructor");
 	}
 	

 
 Employee(int id, String name, double salary){
	 this.id = id;
	 this.name = name;
	 this.salary = salary;
	  System.out.println("parameterised constructor");

 }
 
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
 
  
 
 
 
 }