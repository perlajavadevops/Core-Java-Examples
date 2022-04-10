
public class StringBufferDemo {

	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer("Hello");// Hello --> olleH
		/*String s = sb.toString();
		System.out.println(s.length());*/
		//System.out.println(sb.capacity());
		StringBuilder sb = new StringBuilder("Perla");

		//System.out.println(sb.length());
		
		//System.out.println(sb.reverse());//alreP
		System.out.println(sb.delete(1, 3));
		System.out.println(sb.append(" Reddy"));
		
		//Exceptional Handling
	}
}


//what is the difference b/w String, StringBuffer and StringBuilder