package demo.pack;

import com.A;

/*
 * Pre-defined and user defined
 */
public class PackageDemo extends A{
	
	
	public PackageDemo(int a, int b) {
		super(a, b);
	}
	public static void main(String[] args) {
		PackageDemo aobj = new PackageDemo(12,12);
		
		System.out.println(aobj.a);
		
		
		//Access modifies
		//Encaspulation
		//String Handling
	}
}
