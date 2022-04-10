package com.karnav;
public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
	/*	Child1 child1 = new Child1();
		System.out.println(child1.land);
		child1.printHouseDetails();
		System.out.println("===================");
		Child2 child2 = new Child2();
		System.out.println(child2.land);
		child2.printHouseDetails();*/
		
		
		Parent parent = new Child1();//poly and method overriding
		parent.printHouseDetails();
		System.out.println(parent.land);
		//parent.m();
	}
}
