package com.karnav;

class Vehicle{
	
	public Vehicle() {
		System.out.println("Vehicle class constr");
	}
	public int speeedLimit =400;
	
	public void run(int speed){
		System.out.println("Vehicle is running successfully");
	}
}

class Truck extends Vehicle{
	
	//public int speeedLimit =300;
	
	public Truck() {
		super();
		System.out.println("truck class cons");
	}
	
	/*@Override
	public void run(int a) {
		System.out.println("Truck is running with speed "+speeedLimit);
		System.out.println("Truck is running with speed "+super.speeedLimit);
	}*/
	
}

class BenzTruck extends Truck{
	
	
	public void m(){
		//System.out.println(super.speeedLimit);
		super.run(20);
	}
	
}
class BigTruck extends Vehicle{
	
	public void run() {
		System.out.println("Big Truck is running..."+speeedLimit);
	}
}
public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		Vehicle truck = new Truck();//creation  //Polymor
		truck.run(10);
		
		//BigTruck vehicle = new BigTruck();//
		//vehicle.run();
	//	vehicle.run(30);
		
		//Truck benz = new BenzTruck();
		//benz.m();
	}
}
