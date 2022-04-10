import java.io.FileInputStream;
import java.io.IOException;


class Car {
	public void m() throws IOException {
		System.out.println("Jo");
		FileInputStream fis = new FileInputStream("abc.txt");

		System.out.println("Reddy");
	}
}

class Tata extends Car{
	@Override
	public void m() throws IOException {
		System.out.println("Tata car m() method");
	}
}

public class MethodOverridingException {

	public static void main(String[] args) {

		Tata car = new Tata();
		try {
			car.m();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
