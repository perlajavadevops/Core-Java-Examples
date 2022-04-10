package com.roshmi;

public class ExceptionDemo6 {

	public static void ageValidation(int age){
		if(age<18){
			throw new ArithmeticException("Not valid age");
		}else{
			System.out.println("Age is greater than 18");
		}
	}
	
	public static void main(String[] args) {
		ageValidation(12);
	}
}
