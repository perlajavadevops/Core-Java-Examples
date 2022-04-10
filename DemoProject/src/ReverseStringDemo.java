
public class ReverseStringDemo {

	public String reverseStr(String name){
		String reverse = null;
		if(name!=null && name.length()<=1){
			return name;
		}else{//Manasi //anasi
			reverse = reverseStr(name.substring(1))+name.charAt(0);
			return reverse;
		}
	}
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Manasi");
		ReverseStringDemo rev =  new ReverseStringDemo();
	//	System.out.println(sb.reverse());//isanam
		System.out.println(rev.reverseStr("adkf"));//alreP //fkda
		//System.out.println(sb.substring(1));
		
		
		//how to reverse a string using recursive.//F5,F6,F7,
		
	}
}
