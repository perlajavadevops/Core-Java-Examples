public class SingleInheritanceDemo {

	
	
	public static void main(String[] args) {
		
		 // Parent parent = new Parent();//Parent objecj System.out.println(parent.land);
		  //parent.printHouseDetails();
		  
		  //parent.m();//child 
		  //System.out.println(parent.land);//
		  
		/*
		 * System.out.println("======child class object=========="); Child child = new
		 * Child(); System.out.println(child.land); child.printHouseDetails();
		 */
		
		//creating parent class object by using child class constructor
		Parent parent1 = new Child();//Up-casting or auto boxing // Polymrp
		//1. parent class object 2. child class object 3. parent and child class object 4. no of the above
		//System.out.println(parent1.land);//Poly
		parent1.printHouseDetails();//calling will be decided at runtime which is called runtime poly or dyanmic method dispatch
		//System.out.println(parent1 instanceof Child);//true //IS-A relationship
		//System.out.println(parent1 instanceof Parent);//true//HAS-A relationship
			 
		
		parent1.m();
		
		Child child =  new Child();
		child.printHouseDetails();// what is method dispatch?(runtime poly
		child.m();//
		System.out.println(child.land);
		
	}
}
