
public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Junery Started");
		try{
			String name  = args[0];
			System.out.println("Hi "+name);
		}catch(ArrayIndexOutOfBoundsException arrayEx){
			throw new ArrayIndexOutOfBoundsException("Please enter value");
			//System.out.println("Handled 2");
		}catch(Exception arrayEx){
			System.out.println("Handled");
		}finally{
			System.out.println("Finally block executed");
			//
		}
		try{
			
		int  a = 10/0;
		System.out.println("Hi "+a);

		}catch(ArithmeticException arEx){
		    System.out.println("Handled Exce");

		}
		
		System.out.println("Jurney Completed");
	}
}
