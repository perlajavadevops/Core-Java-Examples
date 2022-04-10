package org;

import com.Student;


public class PackageDemo1 {

	public static void main(String[] args) {
	/*	DefaultDemo.m();
		System.out.println(DefaultDemo.a);*/
		
		/*ProtectedDemo.m();
		System.out.println(ProtectedDemo.a);*/
		
		Student st1 = new Student();
		st1.setAddress("USA");
		st1.setName("perla");
		st1.setSno(900);
		
		System.out.println(st1.getSno());
		System.out.println(st1.getName());
		System.out.println(st1.getAddress());

	}
}
