
public class MethodsDemo {

	//What is method or function? // method means it is king funchtion were it will expose the behaviour of an object
	//How many types of metods? 2: static methods and instance methods
	/*
	 * static method: in method defination if you use static word then it is static method
	 * static methods can be accessed by through the class name(static way).
	 * 
	 * instance mehtod: 
	 * 1. have create a object to call or access the instance.
	 * 2. method def should not ahve staic key mean it is instance.
	 */
	
	public void instanceMethod(){
		System.out.println("Hi Instance mehtod");
	}
	public static void staticMethodDemo(){
		System.out.println("Hi static method");
	}
	
	public static void main(String[] args) {
		//MethodsDemo.staticMethodDemo();
		//staticMethodDemo();
		MethodsDemo demo = new MethodsDemo();//MethodsDemo() we can call it as cons
		demo.instanceMethod();
		
	}
}



