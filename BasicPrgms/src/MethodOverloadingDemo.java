
public class MethodOverloadingDemo {

	//No of arguments
	//by the chaning the parameters data type
	//user 1 req
	public static int add(int n1, int n2){
		System.out.println("int, int method");//this
		return n1+n2;
	}
	
	
	public static long add(long n1, int n2){
		System.out.println("long, int method");
		
		return n1+n2;
	}
	
	public static long add(int n1, long n2){//2 min pls
		System.out.println("int, long method");

		return n1+n2;
	}
	
	//user 2 req
	public static int add(int n1, int n2, int n3){
		System.out.println("int, int, int method");

		return n1+n2+n3;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(10, 30L)); 
		System.out.println(add(40L, 10));
		System.out.println(add(10, 10));
		System.out.println(add(20,20,20));
	}
	
	
	
}
