package com.karnav;
class Bike{
	
	public int speedLimit = 200;
	
	/*public Bike(int a) {
		System.out.println("Bike class Const");
	}*/
	public void run(){
		System.out.println("Bike is running");
	}
	
	public void bikeBreak(String br){
		System.out.println("Break");
	}
}

class Honda extends Bike{
	
	public int speedLimit = 400;
	
	/*public Honda() {
		//super(1);
		System.out.println("Honda class Const");
	}*/
	
	/*public Honda(int a) {
		//super();
		System.out.println("Honda class Const");
	}*/
	@Override
	public void run() {
		System.out.println("Honda bike is running with speed of "+super.speedLimit);
		//super.bikeBreak("dkd");
	}
	
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		//Honda honda = new Honda();
		Bike honda = new Honda();//it will create honda class object rather than bike class object
		System.out.println(honda);
		honda.run();//method call //What is binding?
		honda.bikeBreak("e");
	}
}
