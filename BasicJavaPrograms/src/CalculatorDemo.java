
public class CalculatorDemo {

	//2-arg add method
	public static void add(int a, int b){
		System.out.println("a+b = "+(a+b));
		
		/*System.out.println(1+1);//
		System.out.println("Mahesh"+1);//Mahesh1
		System.out.println('c'+1+2+"Mahesh");
		System.out.println((1+2)+"Mahesh");//3Mahesh
*/	}
	
	//3-arg add method
	public static int add(int a, int b, int c){
		System.out.println("a+b+c = "+(a+b+c));
		
		return a;
	}
	
	//3-arg add method
	public static float add(int a, int b, int c,int d){
		System.out.println("a+b+c = "+(a+b+c));
		return b;
	}
		
		
	
	public static void add(int a, float b){
		System.out.println("a+b = "+(a+b));
	}
	
	public static void add(float a, int b){
		System.out.println("a+b = "+(a+b));
	}
	
	public static void promotion(int n, long m){
		System.out.println("int, long");
		
	}
	
	public static void promotion(long n, int a){
		System.out.println("long, int");
		add(10,10);
	}
	
	public static void main(String[] args) {
		//add(10, 10);
		promotion(90l,90);
		//promotion(90,90l);
		/*add(10,13.0f);
		add(12.0f,10);
		add(10, 10, 10);
		
		
*/	}
}
