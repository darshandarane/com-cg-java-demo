package com.cg.demo.method;

public class Product {

	String name;
	double costprice;
	double sellingprice;
	String company;
	
	Product(){
		System.out.println("Shopping mart");
		
	}
	Product(String name, double sellingprice) {
		
		this.name = name;
		this.sellingprice = sellingprice;
		
		System.out.println(" For Customer");
	}
	
	
	Product(String name, double costprice, double sellingprice){
		
		this.name = name;
		this.costprice = costprice;
		this.sellingprice = sellingprice;
		this.company = company;
		System.out.println("For SHopkeeper");
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", costprice=" + costprice + ", sellingprice=" + sellingprice + ", company="
				+ company + "]";
	}
	
}
