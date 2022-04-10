package com.karnav;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		/*Parent parent = new Parent();//Parent objecj
		System.out.println(parent.land);
		parent.printHouseDetails();
		*/
		/*System.out.println("======child class object==========");
		Child child = new Child();
		System.out.println(child.land);
		child.printHouseDetails();*/
		
		//creating parent class object by using child class constructor
		Parent parent1 = new Child();//Up-casting or auto boxing // Interface and abstract class
		System.out.println(parent1.toString());
		System.out.println(parent1.land);//Poly
		parent1.printHouseDetails();
		
	}
}
