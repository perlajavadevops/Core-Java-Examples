
public class MethodsDemo {
	
	static int a=90;
	int b=80;
	//instance method or non-static method or object level method
	public void m(){
		System.out.println("Instanc method example");
	}
	
	//static method or class level method
	public static void n(){
		System.out.println("static method example");
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);//
		n();//calling static method n()
		
		MethodsDemo mD = new MethodsDemo();
		mD.m();//calling instance method m()
	}

}


class VarDemo{
	
	public static void main(String[] args) {
		System.out.println(MethodsDemo.a);//static calling with class name
		MethodsDemo.n();
		
		//creating the object
		MethodsDemo mD = new MethodsDemo();

		System.out.println(mD.b);
		mD.m();
		
	}
}