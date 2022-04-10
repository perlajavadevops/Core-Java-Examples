class Faculty{
	
	public void teach(String s){
		System.out.println("Faculty is teaching...");
	}
}

class Science extends Faculty{
	
	public void teach() {
		System.out.println("Faculty is teaching Science...");
	}
}

class AppliedPysics extends Science{
	
	public void tech() {
		System.out.println("Faculty is teaching AppliedPhysics....");
	}
}
class Maths extends Faculty{
	
	public void teach(String s) {
		System.out.println("Faculty is teaching Maths....");
	}
	
	public void teach() {
		System.out.println("Faculty is teaching Maths....");
	}
}


public class InheritanceDemo {
	
	public static void main(String[] args) {
		Faculty ma = new Maths();//upcasting
		Maths m1 = (Maths)ma;//Down casting
		m1.teach();
		
		Faculty sce = new Science();
	}	
	

}
