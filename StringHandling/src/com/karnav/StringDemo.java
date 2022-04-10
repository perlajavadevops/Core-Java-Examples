package com.karnav;

public class StringDemo {

	//
	public static void main(String[] args) {
		String s1 = "Hello,Roshmi, Good, Morning";//Immutal //trim(), toLowerCase(). toUpperCase(),
		String s2 = "Hello Karnav";
		String s3 = "hello";
		String s4 = new String("Hello"); //hello //HELLO, indexOf("")
		//System.out.println(s2.length()>0 || s2.length()<6);
	/*	String s5 = "90";
		int i = Integer.parseInt(s5);
		System.out.println(i);
		
		float f = 900;
		String s6 = String.valueOf(f);
		System.out.println();*/
		//System.out.println(s2.isEmpty());
		/*char[] chArr = s2.toCharArray();//'H','e'
		for (int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}*/
		
	/*	byte[] byArr = s2.getBytes();//
		for (int i = 0; i < byArr.length; i++) {
			System.out.println((char)byArr[i]);
		}*/
		
		/*String[] strArray = s1.split(",");//converting string to string[]
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i].trim());
		}*/
		
		//System.out.println(s1.indexOf('H'));
		
		//s4 = s4.intern(); 
		//s1 = s1.concat(" Karnav");//re intialization
		//System.out.println(s1);//Hello Karnav
		
		//equals(), ==, compareTo(), equalsIgnorCase()
		/*System.out.println(s1.equals(s4));//true or false
		System.out.println(s1 ==  s4);*///true or false 
	/*	System.out.println(s1.equals(s2));//false or true
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);//true or false
		
		System.out.println(s1==s3);//true or false
		System.out.println(s1.equals(s3));//false
*/		
		
		//System.out.println(s1.compareTo(s2));//true or false
		//System.out.println(s1.compareTo(s2));//Hello to hello == -32 72-104 =  -32
		
		//System.out.println(s1.equalsIgnoreCase(s3));//true 
		
		//
		
		
		
	}
}
