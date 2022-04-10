package soft.pgr;

import soft.A;

public class D extends A{
	
	//private, default, protected, public

	public static void main(String[] args) {
		D aa = new D();//
		aa.m();
		System.out.println(aa.sno);

		soft.pgr.A aa1 = new soft.pgr.A();// fully qualified class
	}
}
