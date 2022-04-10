package com.roshmi;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello,Roshmi, Good, Morning";// by literal //101
		String s2 = "hello"; // 101 101
		String s3 = "8";
		String s4 = new String("Hello");
		
		/*int a = 90;
		String nu = String.valueOf(a);
		System.out.println(nu);*/
		
		String con= "Hi";
		
		Integer b = Integer.parseInt(con);
		System.out.println(b);
		
		Double d = Double.parseDouble(con);
		System.out.println("double value is "+d);
				
				//int --> Integer, Float, Character, Short, Byte, Boolean, Double, Long
		
		System.out.println("s2 length "+s2.length());
		//char ch = 'c';
		//System.out.println(s1.substring(3));
	//	System.out.println(s1.substring(3, 5));
		//System.out.println(s1.indexOf('l'));
		//s1 = "Welcome";
		
		/*char[] arr = s2.toCharArray();//['h','e','l','l','o']
		System.out.println(arr.length);
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
		
		
		
		/*byte[] arr = s2.getBytes();//IO stream
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
		
		//Strings is completed
		//valueOf(), StringBuffer and StringBuilder
		//Exceptional Handling
		/*System.out.println(s1.startsWith("h"));
		System.out.println(s1.endsWith("g"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());*/
		/*String[] message = s1.split(",",2);
		System.out.println(message.length);
		System.out.println(message[0]);
		for(int i=0; i<message.length;i++){
			System.out.println(message[i]);
		}*/
		//s1 = s1.concat("Welcome");//HelloWelcome // 102
		/*System.out.println("String length is "+s1.length());
		*///System.out.println(s1.contains("r"));
		//System.out.println(s1.isEmpty());
		//Comparing the string values
		//equal, equalsIng, compareto, == operator 
		
	//	System.out.println(s1.equals(s3));//false
		//System.out.println(s1.equals(s2));//true
		//System.out.println(s1==s2);//true
	/*	System.out.println(s4.equals(s1));//truer
		System.out.println(s1.intern().equals(s4.intern()));
		System.out.println(s1==s3);//false
		System.out.println(s3==s2);//false
		s4 = s4.intern();
		System.out.println(s4==s1);//false //101 201
		*/
		//System.out.println(s1.equalsIgnoreCase(s3));
	//	System.out.println(s4.hashCode());
		//System.out.println(s1.hashCode());
		
		//System.out.println(s1.compareTo(s3));//ASCII 72-104
		/* -values means it is less value
		 * +value means it greater value
		 * 0 == equls Comparable
		 */
		
		//StringBuffer sb = new StringBuffer("Hello");
		//sb.append(" Perla");
		//sb.insert(0, "h");
		//System.out.println(sb);
		
		//System.out.println(sb.delete(0, 2));
		//System.out.println(sb.toString());
		
	}
}
