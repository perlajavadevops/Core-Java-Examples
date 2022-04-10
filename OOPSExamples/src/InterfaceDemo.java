//From java8
//@FunctionalInterface
interface L{
	
	int PANCARD=90;//Constants i.e PANCARD, GREENCARD, H1BVISA: T70303
	
	public abstract void m();
	void n();
	
	/*public void q(){
		
	}*/

	//it is java 8 feature
	/*public default void n(){
		
	}
	
	public default void p(){
		
	}*/
	
}

interface P{
	void r();
	void m();
}

class M implements L,P{

	@Override
	public void m() {
		System.out.println("M method ?");
	}

	@Override
	public void n() {
		System.out.println("N method L interface");
	}

	@Override
	public void r() {
		System.out.println("R mehtod from P interface");
	}
	
}
//4 tyeps access specifiers -->private, default, protected, public
//Packages
//What is package?
//com.google.
//Access modifiers and packages Encapsulation
//if, else, while do-whiles, for, switch, 
public class InterfaceDemo {

	public static void main(String[] args) {
		P l = new M();
		
		//l.m();
		if (l instanceof L) {//true
			l.m();
			//l.n();			
		}else if(l instanceof P){//false
			System.out.println("el");
			l.m();
		}
		P p = new M();
		p.r();
		
		System.out.println(L.PANCARD);
	}
	
}
