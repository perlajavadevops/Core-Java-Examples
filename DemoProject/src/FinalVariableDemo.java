
public class FinalVariableDemo {

	public final int fixedRate;
	
	
	/*
	 * public FinalVariableDemo() { fixedRate = 200; }
	 */

	
	public FinalVariableDemo(int fixedRate) {
		this.fixedRate = fixedRate;
	}
	public static void main(String[] args) {
		FinalVariableDemo finalVarialbe =  new FinalVariableDemo(100);
		FinalVariableDemo finalVarialbe1 =  new FinalVariableDemo(110);
		System.out.println(finalVarialbe.fixedRate);
		System.out.println(finalVarialbe1.fixedRate);
		//finalVarialbe.fixedRate = 100;
	}
	
}
