package org;

public class A {

	protected A(){
		System.out.println("A cons");
	}
	protected static int a =90;
	
	protected static void m(){
		System.out.println("M method of org.A class");
	}
	public static void main(String[] args) {
		
		A aObj  = new A();
		System.out.println(a);
		m();
	}
}
