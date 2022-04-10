
public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		/*Parent parent = new Parent();//Parent objecj
		System.out.println(parent.land);
		parent.printHouseDetails();
		
		System.out.println("======child class object==========");
		Child child = new Child();
		System.out.println(child.land);
		child.printHouseDetails();*/
		
		//creating parent class object by using child class constructor
		/*Parent parent1 = new Child();//Up-casting or auto boxing // Polymrp
		
		System.out.println(parent1.land);//Poly
		parent1.printHouseDetails();*/
		
		Child childObject = new Child();
		//System.out.println(childObject.grandLand);
		System.out.println(childObject.land);
		
	}
}
