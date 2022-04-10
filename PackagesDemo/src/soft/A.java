package soft;

public class A {

	public int sno = 80;

	public void m() {
		System.out.println("A m() method");
	}
	
	public static void main(String[] args) {
		A a  =  new A();
		System.out.println(a.sno);
	}
}
