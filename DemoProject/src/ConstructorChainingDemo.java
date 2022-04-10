class Customer{
	
	int customerId;
	String name;
	
	public Customer() {
		this(101);
		System.out.println("0-arg cons");
	}
	
	public Customer(int customerId){
		System.out.println("1-arg cons");
	}
	
}

public class ConstructorChainingDemo {

	public static void main(String[] args) {
		Customer customer = new Customer();
	}
	
}
