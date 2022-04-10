interface Car1{
	
	int a=90;
	
	void speedLimit();
	
	
	public abstract void run();
}

interface Benz1 extends Car1{

	public void headUnit();

}

/*class BenzEClassCar implements Benz1,Car1{

	@Override
	public void speedLimit() {
		System.out.println("speed limit");		
	}

	@Override
	public void run() {
		System.out.println("benz car is running");		

	}

	@Override
	public void headUnit() {
		System.out.println("Benz car Head Unit");		
		
	}
	
}*/
public class AbstractionDemo2 {
	
	
	public static void main(String[] args) {
		/*BenzEClassCar car1 = new BenzEClassCar();
		car1.run();
		car1.speedLimit();
		car1.headUnit();*/
		
		//Benz1 car2 = new BenzEClassCar();

		//car2.headUnit();
		
		Car1 car3 = new Car1() {//Strings//Exceptional Handling
			
			@Override
			public void speedLimit() {
				System.out.println("Hi");
			}
			
			@Override
			public void run() {
				System.out.println("Run");
			}
		};
		
		
	}
}
