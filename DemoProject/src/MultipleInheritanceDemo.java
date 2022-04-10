/*class A{
	public void m(){
		System.out.println("A class M method");
	}
}

class B{
	public void m(){
		System.out.println("B class M method");
	}
}

class C extends A, B {
	
	public static void main(String[] args) {
		C cObject = new C();
		cObject.m();
	}
}*/

interface A{
	public void m();
}

interface B{
	public void q();
	public void m();
}

class C implements A ,B{

	@Override
	public void m() {
		System.out.println("M method");
	}
	
	@Override
	public void q() {
		System.out.println("q method");
	}
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		A a =  new C();
	    a.m();
	    
	    B b = new C();
	    b.q();
	}
}
