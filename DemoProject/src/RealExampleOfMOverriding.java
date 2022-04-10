/*class Bank {
	int getRateOfInterestForEducation() {
		return 10;
	}
}
*/

abstract class Bank {
	abstract int getRateOfInterestForEducation();
}

/*interface Bank{
	abstract int getRateOfInterestForEducation();

}*/

// Creating child classes.
class SBI extends Bank {
	int getRateOfInterestForEducation() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterestForEducation() {
		return 7;
	}
}

class AXIS extends Bank {
	int getRateOfInterestForEducation() {
		return 9;
	}
}

public class RealExampleOfMOverriding {

	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterestForEducation());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterestForEducation());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterestForEducation());
	}

}
