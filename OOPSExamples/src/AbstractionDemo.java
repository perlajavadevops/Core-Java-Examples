abstract class User{
	
	public abstract void createUser();//hidding implementation and shwoing only funcationality
	
	int b = 90;
	
	public User(int a, String n){
		System.out.println("a value is "+a);
		System.out.println("n value is "+n);
	}
	public void updateUserDetails(){//Concrete  method
		System.out.println("User updated details successfully");
	}
}

abstract class Admin extends User{
	
	public Admin(int a, String n) {
		super(a, n);
	}

	public abstract void createUser();//hidding implementation and shwoing only funcationality

}

class NormalUser extends User{//extends key will not support extending multiple classes

	public NormalUser(int a, String n) {
		super(a, n);
	}

	@Override
	public void createUser() {
		System.out.println("Normal User created Successfully");
	}	
}

class Sender extends User{
	public Sender(int a, String n) {
		super(a, n);
	}

	@Override
	public void createUser() {
		System.out.println("Sender User created Successfully");		
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
	//	User user = new User(10,"Reddy"); // compile time error
		
		User normalUser = new NormalUser(10,"Reddy");//Upcasting 
		normalUser.createUser();//runtime i.e polypor : method call will be resolved at runtime is nothing runtime poly
		normalUser.updateUserDetails();
		
		User senderUser = new Sender(20,"Roshmi");
		senderUser.createUser();
		senderUser.updateUserDetails();
	}
}
