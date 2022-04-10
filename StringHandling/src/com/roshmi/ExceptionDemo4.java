package com.roshmi;

import java.io.IOException;

public class ExceptionDemo4 {

	public static void m() throws IOException{
		throw new java.io.IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		ExceptionDemo4 obj = new ExceptionDemo4();
		obj.p();
		System.out.println("normal flow");
	}
}

// throws and throw try, catch, finally
