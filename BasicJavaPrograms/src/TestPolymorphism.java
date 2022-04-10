class Bank {

	//public float rateOfInterest = 11.0f;//World Bank RBI 

	float getRateOfInterest() {
		return 10.0f;
	}

	Bank() {
		System.out.println("Super class Cons");
	}
}

class SBI extends Bank {
	//public float rateOfInterest = 10.0f;

	public SBI() {

	}

	float getRateOfInterest() {
		//System.out.println(super.getRateOfInterest());
		return 8.4f;
	}
}

class BankA extends Bank {

}

class ICICI extends BankA {
	//public float rateOfInterest = 9.0f;

	float getRateOfInterest() {
		//System.out.println(super.getRateOfInterest());
		return 7.3f;
	}
}

class AXIS extends Bank {
	float getRateOfInterest() {
		return 9.7f;
	}
}

public class TestPolymorphism {
	public static void main(String args[]) {//Final
		Bank b;
		b = new SBI();
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
		b = new AXIS();
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());

	}
}