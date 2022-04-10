
public class StringDemo1 {
/*
 *
 * 
 */
	
	public static void main(String[] args) {
		String s1 = "Hello";//using string litteral
		String s2 = "Hello,Confience,Good,Morning";//Hello, Confience, Good, Morning --split()
		String s3 = "hello";//1-9 =-8
		String s4 = new String("Hello");
		//s4 = s4.intern();
		//char[] ch = s3.toCharArray();
		
		//StringBuffer sb = new StringBuffer("Perla Reddy");
		
		//sb.append("ABC");
		//System.out.println(sb);
		//sb.reverse();
		//System.out.println(sb);
		
		//String[] arr = sb.toString().split(" ");
		
	//	StringBuffer --reverse, remove
	//	StringBuilder
		
		//String s5 = new String("hi");
		//System.out.println(s3.toUpperCase());
		//System.out.println(s3.contains("ab"));
		//System.out.println(s3.trim());
		//s3 = s3.concat(s1);
		//System.out.println(s3.startsWith("M", 0));
	  //  s3 = s3.concat(" hi");// Re-iniliazation
		//System.out.println(s3.length());//hellohi
		//System.out.println(s3);//MahesHi
		
		//System.out.println(s3.indexOf('l'));//hello
		/*System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(s4));//true
		System.out.println(s1==s4);//false
		System.out.println(s1.equalsIgnoreCase(s3));//true
*/		
		//System.out.println(s1.endsWith("o"));

		//System.out.println(s1.compareTo(s3));//false//107-75=32
		//System.out.println(s1.toUpperCase());
		//System.out.println(s2.toLowerCase()); //hello --> {'h','o','h'}
		/*s1 = s1.concat("Reddy");
		System.out.println(s1);
		System.out.println(s1.startsWith("K"));
		*/
		/*char[] chArray = s1.toCharArray();//Hello {'H','e','l','l','o'}
		for (int i = 0; i < chArray.length; i++) {
			System.out.println(chArray[i]);
		}
		*///System.out.println(s1.concat("Reddy"));
		//System.out.println(s1.length());
		//System.out.println(s1.contains("aa"));//false
		//String s2 = new String("Mahesh");
		
		/*s1 = s1.replaceAll(s1, "Mahesh.Reddy.Perla");
		String s5="";
		System.out.println(s5.isEmpty());//
		String[] nameSplit = s2.split("\\,");
		for (int i = 0; i < nameSplit.length; i++) {
			System.out.println(nameSplit[i]);
		}*/
    	//StringBuffer and StringBulder
		StringBuffer sb = new StringBuffer(s1);//multithreding --thread safe and not thread safe  -- Exception
		System.out.println(sb);
		sb.append(" Confience");
		System.out.println(sb);
		
		String s6 = sb.toString();
		
		
		System.out.println(s6);
		//System.out.println(s1.isEmpty());
		/*
		System.out.println(s1);
		String s3 = s1.substring(2);
		System.out.println(s3);
		System.out.println(s1.trim());
		*/
	}
}
