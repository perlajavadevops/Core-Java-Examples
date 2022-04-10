
public class SofterTeacher extends Teacher{
	
	//IS-A raletion
	
	/*@Override
	void does() {
		System.out.println("Java Trainer");
	}*/
	
	public static void main(String[] args) {
		
		SofterTeacher st = new SofterTeacher();
		
		st.does();
		
		System.out.println(st.collegeName);
		System.out.println(st.designation);
	}

}
