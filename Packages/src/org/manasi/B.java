package org.manasi;

import org.ProtectedDemo;
import org.PublicDemo;


public class B extends ProtectedDemo{

	public static void main(String[] args) {
		System.out.println(B.a);
		System.out.println();
		B.m();
		
		System.out.println(PublicDemo.a);
		PublicDemo.m();
		
	}
}
