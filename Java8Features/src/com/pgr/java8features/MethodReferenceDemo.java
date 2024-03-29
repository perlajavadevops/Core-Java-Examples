package com.pgr.java8features;

import java.util.function.IntFunction;
class Dog{
	
	Dog(String sound){
		System.out.println(sound);
	}
}
@FunctionalInterface
interface Animal {
	//int sound();
	
	Dog getDog(String sound);
}

public class MethodReferenceDemo {

	public static int m(int a) {
		System.out.println("Static Method");
		return a;
	}
	
	public static int n() {
		System.out.println("Static Method");
		return 0;
	}
	
	
	public int p() {
		System.out.println("Instance Method");
		return 0;
	}
	
	public static void main(String[] args) {
		/*
		 * Animal an = () -> System.out.println("Hello Lambda expression"); an.sound();
		 */
		
		
		Animal animal = Dog::new;
		animal.getDog("bow");
		/*
		 * Animal animal = MethodReferenceDemo::n; System.out.println(animal);
		 * System.out.println(animal.sound());
		 * 
		 * MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo(); Animal
		 * animal1 = methodReferenceDemo::p; animal1.sound();
		 * 
		 * IntFunction<Integer> intFun = MethodReferenceDemo::m;
		 * 
		 * System.out.println(intFun.apply(20));
		 */
	}
}
