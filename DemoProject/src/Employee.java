
public class Employee {

	public int empId;
	public String name;
	public String company;
	public double salary;
	public long phoneNumber;
	
	
	public Employee(int empId, String name, String company, double salary, long phoneNumber) {
		
		this.empId = empId;
		this.name = name;
		this.company = company;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
	}

	public void displayEmployeeDetails(){
		System.out.println("Emp Id : "+empId);
		System.out.println("Name : "+name);
		System.out.println("Company : "+company);
		System.out.println("Salary : "+salary);
		System.out.println("Phone Number : "+phoneNumber);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(100, "Perla", "Abcd Company", 9999.99, 898999);
		emp1.displayEmployeeDetails();
	}
	
}
