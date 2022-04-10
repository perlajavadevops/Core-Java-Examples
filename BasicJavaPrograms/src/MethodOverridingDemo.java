class Bike{

	public int speed =200;

	public void run(){
		System.out.println("Bike is running with speed of 200");
	}
	
	public void m(){
		System.out.println("method overriding demo");
	}
}

class Splendar extends Bike{
	
	public int speed =180;
	
	@Override
	public void run() {
		System.out.println("Splendar is running with 180 speed limit");
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		Bike splendar = new Splendar();//we used splendar() con to create the object bike clas.
		splendar.run();
		splendar.m();
		Splendar sp = (Splendar)splendar;
		System.out.println(sp.speed);
		
		Bike bike = new Bike();
		bike.run();
	}
}
