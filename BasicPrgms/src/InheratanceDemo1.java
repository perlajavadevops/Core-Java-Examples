
public class InheratanceDemo1 {

	public static void main(String[] args) {
		Animal dog = new Dog();//Upcasting
		dog.eat();//how it is working? //Polymorphims
		//dog.dogSound();//Downcasting
		//dog.weep();
		
		System.out.println("==========================");
		Cat cat = new Cat();
		cat.eat();
		cat.catSound();
		
	}
}
