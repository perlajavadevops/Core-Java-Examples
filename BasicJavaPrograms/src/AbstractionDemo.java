/*
 * 1. abstract class() and interface(
 */

abstract class Car{
	//
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public int speedLimit=400;
	
	{
		
	}
	
	{
		
	}
	
	static{
		
	}
	
	static{
		
	}
	
	public void getSpeedLimit(){
		System.out.println(speedLimit);
	}
	
	public void headUnit(){
		
	}
	
	
	public abstract void run();//abstract mehtod declaration
}

class Benz extends Car{

	@Override
	public void run() {
		System.out.println("Benz Car running");
	}
	
}

/*class BenzEClassCar1 extends Benz,Car{
	
}*/

class Suzuki extends Car{

	@Override
	public void run() {
		System.out.println("Suzuki Car running");
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		Car car1 = new Benz();
		car1.run();
		car1.getSpeedLimit();
		
		Car car2 = new Suzuki();
		car2.getSpeedLimit();
	}
 
}
