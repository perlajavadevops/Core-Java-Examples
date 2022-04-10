
public class StaticVarDemo {

	int a = 1;
	
	public static void main(String[] args) {
		StaticVarDemo demo = new StaticVarDemo();
		StaticVarDemo demo1 = new StaticVarDemo();

		//System.out.println(a);
		++demo.a;//2
		++demo1.a;

		System.out.println(demo.a);//2
		System.out.println(demo1.a);//2

		/*--a;//2-1 =1
		System.out.println(a);*/
		
	}
}
