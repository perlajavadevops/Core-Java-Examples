package com.nandi;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = "Hello,Roshmi,Good,Morning";// by literal //101
		String s2 = " Hello Reddy ";
		String s3 = "hello";
		String s4 = new String("perla");//107
		
		System.out.println(s2);
		System.out.println(s2.trim());// Exception handling
		//System.out.println(s2.equalsIgnoreCase(s3));//
		//System.out.println(s3.compareTo(s2));//72-107 == -32
		//System.out.println(s3.contains("a"));
		/*char[] arr = s3.toCharArray();//['h','e','l','l','o']
		System.out.println(arr.length);
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
		
	/*	byte[] arr = s2.getBytes();//IO stream //
		for(int i=0; i<arr.length;i++){
			System.out.println((char)arr[i]);
		}*/
		
		/*String[] message = s1.split(",");//[hello, roshmi, good, morng]
		System.out.println(message.length);
		for(int i=0; i<message.length;i++){
			System.out.println(message[i]);
		}*/
		
		
		//System.out.println(s4.length());
		/*if(s4.isEmpty()){
			System.out.println("Username empty");
		}else{
			System.out.println("Username not empty");
		}
		System.out.println(s4.isEmpty());//false
		*/
	/*	System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s3);//true or false? ==false
		System.out.println(s1.equals(s3));//false
*/		//System.out.println(s1.hashCode());
		/*s4 = s4.intern();
		System.out.println(s1==s4);//true or false
		
		System.out.println(s4.hashCode());

		System.out.println(s1.equals(s4));
*/		
	}
}
