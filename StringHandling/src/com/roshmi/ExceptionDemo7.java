package com.roshmi;

public class ExceptionDemo7 {

	public static void m() {
		int a = 10 / 0;
		System.out.println(a);
	}

	public static void n() {
		m();
	}

	public static void q() {
		try {
			n();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		q();
		System.out.println("normal flow");
	}

}
