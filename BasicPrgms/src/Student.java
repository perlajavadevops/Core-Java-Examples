public class Student {

	//int data = 90;//instance variable declaration and initialization
	//static int b= 100;//static variable
	static int a;//static variales declaration //0.0 /F0000 ( )
	static long b;//initialization  //byte-->short-->int-->long-->float-->double
												//   |
												// char //boolean--false
	static short s;
	static byte by ;
	static boolean flag;
	static char ch;
	static float f;
	static double d;
	static String st;
	//static Object obj;
	
	{
		
	}
	
	class A{//inner class
		
	}
	
	static{
		
	}
	public void study(){//
		
	}
	
	Student(){
		
	}
	
	public static void main(String[] args) {
	    boolean localFlag= false;//local varialbe declaration
		System.out.println("int default value is "+a);
		System.out.println("long default value is "+b);
		System.out.println("short default value is "+s);
		System.out.println("byte default value is "+by);
		System.out.println("boolean default value is "+flag);
		System.out.println("char default value is "+ch);
		System.out.println("float default value is "+f);
		System.out.println("double default value is "+d);
		
		System.out.println("boolean default value is "+localFlag);
		
		System.out.println(""+st);
	/*	System.out.println(""+obj);
	*/	
		
		
		
	}
}
