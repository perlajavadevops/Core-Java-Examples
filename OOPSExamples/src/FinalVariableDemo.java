
public class FinalVariableDemo {

	public final int price ;
	
	public FinalVariableDemo(int price) {
		this.price = price;
	}
	public static void main(String[] args) {
		FinalVariableDemo rahil =  new FinalVariableDemo(90);
		FinalVariableDemo perla =  new FinalVariableDemo(100);
		//System.out.println(rahil.price);
		System.out.println(perla.price);
		//rahil.price = 100;
	}
	
}
