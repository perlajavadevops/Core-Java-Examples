package com;


public class A {

	protected int var = 100;
	protected void m(){
		System.out.println("A class M() method");
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.m();
		System.out.println(a.var);
		
		
	}
}
