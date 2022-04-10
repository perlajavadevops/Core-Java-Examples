class A{
	A(){
		B b = new B(this);
	}
}

class B{
	
	A a;
	
	B(A a){
		this.a = a;
	}
}
public class ThisKeywordDemo {

	public static void main(String[] args) {
		A a = new A();
	}
}
