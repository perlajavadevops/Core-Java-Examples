package com.karnav;
/*class A{
	public void m(){
		System.out.println("A class M method");
	}
}

class B{
	public void m(){
		System.out.println("B class M method");
	}
}

class C extends A ,B{
	
	
}*/

interface A{
	public void m();
}

interface B{
	public void q();
}

class C implements A ,B{

	@Override
	public void m() {
		System.out.println("M method");
	}
	
	@Override
	public void q() {
		System.out.println("q method");
	}
}


public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		C a =  new C();
		a.m();
	//	a.q();
	}
}
