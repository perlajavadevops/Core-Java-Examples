package com;

public class PackageDemo1 {

	public void m(){
		System.out.println("Package Demo1 m method");

	}
	
	public static void main(String[] args) {
	
		Student st1 = new Student();
		st1.setAddress("Hyd");
		System.out.println(st1.getSno());
		System.out.println(st1.getName());
		System.out.println(st1.getAddress());
		System.out.println(st1.isFlag());
	}
}
