public class Student {

	// types of variables
	// 1. instance(object level) and static (class varaibles)

	int c = 80;// instance variable or object level
	static int d = 90;// static variable
	
	int e;//declaration
	
	int h =90;

	public static void main(String[] args) {
		// String name = args[0];
		// System.out.println("Sample java pgrm "+name);//+ operator is operator
		// overloading

		// byte a=127;//initalization //Local instance variable //ASCII
		// System.out.println(c);

		// int b;//declaration

		Student st	= new Student();//creating the object by using new Keyword and consturctor
		System.out.println(st.c);
		System.out.println(st.e);
		System.out.println(Student.d);
	}
}
