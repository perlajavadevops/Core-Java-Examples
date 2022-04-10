public class Animal {

	void eat() {
		System.out.println("eating...");
	}

}

class Dog extends Animal {

	@Override
	void eat() {//Sub or Child or Derived
		
		/*
		 * If you define same method in your child(Sub) class which is already present
		 * in your parent class nothing but method Overriding.
		 */
		System.out.println("Dog is eating Non-Veg....");
	}
	
	public void dogSound() {
		System.out.println("Bow Bow....");
	}
}

class PuttyDog extends Dog {

	public void weep() {
		System.out.println("weeping...");
	}
}

class Cat extends Animal {
	public void catSound() {
		System.out.println("Mewow Mewow....");
	}
}
