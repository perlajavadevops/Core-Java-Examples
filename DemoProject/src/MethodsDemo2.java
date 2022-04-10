public class MethodsDemo2 {

	public void instanceMethod() {
		System.out.println("Hi Instance mehtod");
	}

	public static void staticMethodDemo() {
		System.out.println("Hi static method");
	}

	public static void main(String[] args) {

		/*MethodsDemo2.staticMethodDemo();
		MethodsDemo demo = new MethodsDemo();// MethodsDemo() we can call it as
												// cons
		demo.instanceMethod();*/
		
		
		
		//Command line arguments
		String mess = args[0];
		System.out.println(mess);
	}

}
