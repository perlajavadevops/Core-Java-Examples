package com;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] intArray =  new int[2]; //arry initialization
		intArray[0] = 90;
		//intArray[1] = "Testing";
	//	intArray[2] = 110;
		
		
		System.out.println("array length :: "+intArray.length);
		
		for(int i=0;i<intArray.length;i++){
			System.out.println(intArray[i]);
		}
		
		//for-each loop
		for(int a : intArray){
			System.out.println(a);
		}
	}
}
