
public class Student {

	int sno;//0
	String name;//null
	String address;//null
	
	//it is 0-arg constructor
	Student(){
		this(22);// this constructor should be the first statne in the constro call
		System.out.println("() constructor");	
	}
	
	//Single Paramiterized con 
	Student(int a){
		this(20,"manasi");
		System.out.println("(int) constructor");	
	}
	//Double par con
	Student(int a, String n){
		System.out.println("(int, String) constructor");	
	}
	
	//Double par con
	Student(int a, String n, String addr){
		System.out.println("(int, string, string) constructor");	
	}
	
	//Double par con
	Student(String n, int a){
		System.out.println("(stirng, int) constructor");	
	}
	public void displayStudentDetails(){
		System.out.println(sno);
		System.out.println(name);
		System.out.println(address);
	}
	public static void main(String[] args) {
		Student st = new Student();//0-con
		//initial by through objct
		st.name = "Manasi";
		st.address = "USA";
		st.sno=123;
		
		st.displayStudentDetails();
		
	/*	Student st1 = new Student(100);//implicity
		Student st2 = new Student(10,"r");*/
	}
	
	
	
	
	//Parameterizad and constr overloading and this keyword
	//method overloading
	//Constructors Over: the number of agurments should be defferent in con defination.
	//paramertes datyes order
	//This keyword will refer current class object
	//this keyword for constructo, differentiate varialbes instance and local
	//for method this keyword
	//this will work within the class only 
}
