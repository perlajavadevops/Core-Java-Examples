final class  FinalA {//Immutable class
	
	public final void m(){
		System.out.println("FinalA m() method");
	}//Abstraction  and Encapsulation //Interfaces
}
public class FinalKeyDemo{

	final int fixedRate;
	
	public FinalKeyDemo(int rate) {
		fixedRate = rate;
	}

	
	
	public static void main(String[] args) {
		FinalKeyDemo finalKey = new FinalKeyDemo(10);
		System.out.println(finalKey.fixedRate);
		
		FinalKeyDemo finalKey2 = new FinalKeyDemo(11);
		System.out.println(finalKey2.fixedRate);
	}
	
}
