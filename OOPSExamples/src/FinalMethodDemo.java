class FinalMethod1{
	
	public final void m(){
		System.out.println("m method FinalMehtod1 class");
	}
}

class FinalMethod2 extends FinalMethod1{
	/*@Override
	public void m() {
		System.out.println("m method FinalMehtod2 class");
	}*/
}
public class FinalMethodDemo {

	public static void main(String[] args) {
		FinalMethod2 finalMethod2 = new FinalMethod2();
		finalMethod2.m();
	}
	
}
