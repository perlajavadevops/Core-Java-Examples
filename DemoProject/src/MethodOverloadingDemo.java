
public class MethodOverloadingDemo {

	/*
	 * public static void add(int a, int b){
	 * System.out.println("2 numbers addtions is(int, int) "+(a+b));//here '+' is as
	 * addtion }
	 */
	public void add(int a, int b, int c){
	//	 this.add(a, b);
		 System.out.println("3 numbers addtions is "+(a+b+c));//here '+' is as addtion
	}
	
	/*
	 * public static void add(double a, int b){//99.99(Decimal numbers)floating
	 * values System.out.println("2 numbers addtions is(double, int) "+(a+b));//here
	 * '+' is as addtion }
	 */
	
	public void add(long a, int b) {
		System.out.println("2 numbers addtions(long, int) is " + (a + b));// here '+' is addtion //this.add(20, 30L);
	}
	 	
	
	public void add(int a, long b) {
		System.out.println("2 numbers addtions(int, long) is " + (a + b));// here '+' is as addtion
	}
	  
	
	public static void main(String[] args) {
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		demo.add(10L, 30);//20
	//	demo.add(10f, 20);//int
		//demo.add(10L, 10);//type promotion
		//demo.add(20, 20L);
		demo.add(10, 10, 10);
		/*System.out.println(1+1);//2
		System.out.println("hello"+"hello");//hellohello
		System.out.println(1+2+"hello");//3hello
		System.out.println("hello"+(2+3+4));//hello234hello 
*/	}
	
}
