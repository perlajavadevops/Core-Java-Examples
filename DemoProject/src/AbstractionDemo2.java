interface Car{
	
	double PI = 3.14;//
	
	void carGearFuntion();
	public abstract void m();

}

class Benz implements Car{

	@Override
	public void carGearFuntion() {
		System.out.println("Gear Function is working");
	}

	@Override
	public void m() {
		System.out.println("M method");
	}
	
}

public class AbstractionDemo2 {

	public static void main(String[] args) {
		
		Car car = new Benz();
		car.carGearFuntion();
		System.out.println(Car.PI);
		System.out.println(Benz.PI);
		car.m();
		
	}
}
