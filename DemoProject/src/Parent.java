public class Parent /* extends GrandParent */{
	
	int land = 1;// Properties or data members

	public void printHouseDetails() {// Behivour
		System.out.println("parent house");
	}
	
	public int m() {
		System.out.println("Parent class m method");
		return 1;
	}
	
	public static void n() {
		System.out.println("static method");
	}
}
