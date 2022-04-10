package org.pgr;
//import org.A; //Single class import
//import ogr.*; // all classes and interface importing

import org.A;

public class C extends A {

	public static void main(String[] args) {
		/*A orgA = new A();
		B orgB = new B();*/
		//fully qalified name
		A a = new C();
		System.out.println(a.a);
		a.m();
	}
	
	//POJO --Plain old java object
	//java beans, entities, transfer ojbect(TO), DTO(dat)
	
	//
}
