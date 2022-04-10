package com.roshmi;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try{
			int[] arr = {1,3};
			//System.out.println(arr.length);
			System.out.println("1");
			//System.out.println(arr[2]);
			
			
		}catch(ArrayIndexOutOfBoundsException ex){
			System.err.println("Please do not pass morethan 2 values in array because the will take only 2 numbers...");
			//ex.printStackTrace();
			//System.err.println(ex.getMessage());
		}
		try{
			int a = 10/0;
			System.out.println(a);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("2");

	}
}
