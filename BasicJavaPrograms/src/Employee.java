
public class Employee {

	//Instance global variables
	public int empNo;
	public String name;
	public long phoneNumber;
	public float salary;
 //2 types of con
	/*
	 * 1- 0-arg con or Default cons
	 * 2- Parameterized consto
	 */
	//Const overloading
	public Employee(){
		System.out.println("0-arg cons");
	}
	public Employee(int n){
		this();
		System.out.println("Hello 1-arg con");
	}
	public Employee(int empNo,String name, long phoneNumber, float salary){
		this(1011);//0-arg this() con
		System.out.println("Hello 4-arg Const");
		this.empNo = empNo;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.salary=salary;
		
	}
	
	public Employee getEmployeeObject(){
		return this;
	}
	
	/*public Employee(int empnumber,String n){
		System.out.println("Hello 0-arg Const");
	}*/
	public void displayEmplyee(){
		this.n();
		System.out.println(empNo);
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(salary);
	}
	
	public void n(){
		System.out.println("N method");
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Reddy",8080808080L,3030.00F);
		//initialization
		/*emp1.empNo=101;
		emp1.name="Karma";
		emp1.phoneNumber=9090909090L;
		emp1.salary=8000.0f;*/
		
		
		//Employee emp2 = new Employee(102,"Dhatrika",707070707070L,4000.5f);//creating the object by con and will invoke at the time of object creation
		//initialization
		/*emp2.empNo=102;
		emp2.name="Reddy";
		emp2.phoneNumber=8080808080L;
		emp2.salary=7000.0f;*/
		
		emp1.displayEmplyee();
	/*	System.out.println(emp1.empNo);
		System.out.println(emp1.name);
		System.out.println(emp1.phoneNumber);
		System.out.println(emp1.salary);*/
		
		System.out.println(emp1);
		System.out.println("================================");
		/*System.out.println(emp2.empNo);
		System.out.println(emp2.name);
		System.out.println(emp2.phoneNumber);
		System.out.println(emp2.salary);*/
		
	//	emp2.displayEmplyee();
		
		System.out.println(emp1.getEmployeeObject());
		
		//Employee emp3 = new Employee();
	}
}
