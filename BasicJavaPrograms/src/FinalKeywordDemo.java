
public class FinalKeywordDemo {
	public final int FIXED_RATE;
	//
	public FinalKeywordDemo() {
		FIXED_RATE = 80;
	}
	
	public FinalKeywordDemo(int a) {
		FIXED_RATE = 90;
	}
	
	public static void main(String[] args) {
		
		final int a=8;
		FinalKeywordDemo demo = new FinalKeywordDemo(12);
		System.out.println(demo.FIXED_RATE);
		
		System.out.println(a);
	}
	
}
