package com.pgr;

public class A {

	public void m(){
		System.out.println("M mehtod of A class");
	}
	
	public static void n(){
		System.out.println("n method ");
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.m();
	}
}
