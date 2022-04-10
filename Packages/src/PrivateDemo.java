class B{
	private static int val = 30;
	private static void m(){
		System.out.println("private m method");
	}
	
	public static void main(String[] args) {
		m();
		System.out.println(val);
	}
}
public class PrivateDemo {

	public static void main(String[] args) {
	//	B.m();
	}
}
