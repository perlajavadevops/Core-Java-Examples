public class Employee {

	//static method and instance methods
	
	//Global instance variables
	String empName;
	String empNo;
	String empRole;
	double salary;
	
	public Employee() {//0-ARG constru and parameterized con
		this(10);
		System.out.println("0-ARG con");
	}
	public Employee(int a) {//1-ARG parameterized con
		System.out.println("1-ARG con");
	}
	
	public Employee(String a) {//1-ARG parameterized con
		System.out.println("1-ARG con");
	}
	
	/*public Employee(String name, String no, String role, double sal){
		empName = name;
		empNo = no;
		empRole = role;
		salary = sal;
	}*/
	//Rule-the parameters should different
	public Employee(String empName, String empNo, String empRole, double salary){
		this();//chain
		System.out.println("4- arguments constru");
		this.empName = empName;
		this.empNo = empNo;
		this.empRole = empRole;
		this.salary = salary;
	}
	
	/*public Employee(Employee employee) {//0-ARG constru and parameterized con

	}

	/* static and instance method */
	public static void n(){
		System.out.println("static method");
	}
	
	public void work(){
		System.out.println("instance method - work");
		//displayEmployeeDetails();
	}
	
	public void displayEmployeeDetails(){//functionality (Beh
		this.work();
		System.out.println(empName);
		System.out.println(empNo);
		System.out.println(empRole);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		//Employee.n();//static method calling
		
		Employee emp1 = new Employee("Confience", "909", "Developer", 90900);//creating object of Employee class
		emp1.displayEmployeeDetails();
		//Employee emp3 = new Employee(10);//
		/*emp3.empName="Reddy";
		emp3.empNo="101";
		emp3.empRole="Trainner";
		emp3.salary=2000.90;*/
	//	emp1.work();//
		//emp1.displayEmployeeDetails();
		
	/*	Employee emp2 = new Employee();
		
		System.out.println("Emp1 object id "+emp1);
		System.out.println("Emp2 object id "+emp2);
*/
		
		
		//Employee emp3 = new Employee();//creating object by using constructor(default con)
		
	//	emp3.displayEmployeeDetails();//calling instance method using object
		//emp3.work();
	}
}
