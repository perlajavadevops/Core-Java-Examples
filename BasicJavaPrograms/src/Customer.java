
public class Customer {

	public String customerId;
	public String customerName;
	public int age;
	public String dob;
	public long mobileNumber;
	
	//0-arg const
	
	//const  chaining
	//const overloading
	//this keywor
	//inheritance
	//method overloading
	
	public Customer(){
		this(10);
		System.out.println("0-arg constr");
	}
	
	public Customer(int a){
	//	this(this);

		System.out.println("1-arg constr");
	}
	
	public Customer(int a, int b){
		System.out.println("2-arg constr");
	}
	
	public Customer(long a, int b){
		System.out.println("2-arg constr");
	}
	
	public Customer(int a, long b){
		System.out.println("2-arg constr");
	}
	
	//5-args paramerized con
	public Customer(String customerId, String customerName, int age, String dob, long mobileNumber){
		System.out.println("5-arg constr");
		m();
		this.customerId = customerId;
		this.customerName=customerName;
		this.dob = dob;
		this.age=age;
		this.mobileNumber = mobileNumber;
	}
	
	public Customer(Customer customer){
		System.out.println("Demo ");
	}
	
	public void displayCustomerDetails(){
		
		//getCustomerObject(this);
		this.m();
		System.out.println(customerId);
		System.out.println(age);
		System.out.println(customerName);
		System.out.println(dob);
		System.out.println(mobileNumber);
	}
	
	public void m(){
		System.out.println("m method");
	}
	public Customer getCustomerObject(Customer customer){
		return customer;
	}
	public static void main(String[] args) {
		Customer customer1 = new Customer("103", "Siva", 27, "06-06-1992", 7979797979L);//789
		/*customer1.age=90;
		customer1.customerId="101";
		customer1.customerName="Datrika";
		customer1.dob="12-08-2019";
		customer1.mobileNumber=9090909090L;
		*/
	/*	System.out.println(customer1.customerId);
		System.out.println(customer1.age);
		System.out.println(customer1.customerName);
		System.out.println(customer1.dob);
		System.out.println(customer1.mobileNumber);*/
		
		customer1.displayCustomerDetails();
		System.out.println("====================================");
		//Customer customer2 = new Customer("104", "Perla Reddy", 30, "06-06-1998", 8989898989L);
		/*
		customer2.age=60;
		customer2.customerId="102";
		customer2.customerName="Mahesh";
		customer2.dob="12-08-1990";
		customer2.mobileNumber=8080909090L;*/
		
		//customer2.displayCustomerDetails();
		/*System.out.println(customer2.customerId);
		System.out.println(customer2.age);
		System.out.println(customer2.customerName);
		System.out.println(customer2.dob);
		System.out.println(customer2.mobileNumber);*/
		
		//Customer customer3 = new Customer();
		
	}
}
