public class Sample {

	//3 types : instance , static, local
	//Static variables: will use 'static' keyword to define static variables
	public static int a = 100;//declaration //Initialization
	public static long l;//
	//static variables can be accessed by through class name only means it is not required any obect
	
	
	//Instance varialbes: without using static keyword if you define that means it is instance variables 
	
	public float f;//instance variable
	
	public static void main(String[] args) {
		/*System.out.println("Welcome public class Demo");
		String firstName = args[0];
		String lastName = args[1];*/
		//byte, short, int, long, float, double, char, boolean
		//Wrappper classes
		//byte -> Byte, short ->Short, int ->Integer, Long, Float, Double, Character, Boolean
		//parsers methods
		//parseInt, parseDouble
		
		/*long b =  Long.parseLong(firstName);//String to int number conversion
		System.out.println("b value is ==: "+b);
		System.out.println("Name is " + firstName + " " + lastName);*/
		
		System.out.println(Sample.a);
		System.out.println(Sample.l);
		
		Sample sam  =  new Sample();//object creation Object
		
		System.out.println(sam.f);//to access intance variable we need object
		
		//Local variables: within mehtod or cons or with in the block 
		int local =200;//local : local varaibles scope will be within the method
		System.out.println(local);
	}

	/*
	 * Eclisp, variables, datatypes conversion, datatypes default values
	 * 
	 * 1. Wrtie pr to default values for byte, short, int, long, float, double, char, boolean
	 * 2. 
	 * 
	 */
}
