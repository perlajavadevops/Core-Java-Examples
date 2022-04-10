
public class ExceptionDemo3 {

	public static void main(String[] args) {
		System.out.println("Started");
		try{
			int[] arr = new int[2];//2
			arr[0] = 100;
			arr[1] = 200;
		//	arr[2] = 300;
			
			String s = "Hi";
			System.out.println(s.length());
			
			int i = Integer.parseInt(s); //Wrapper classes Integer,Float, Double, Short, Byte, Boolean, Character, Long
			
			/*try{
				int a= 10/0;//infinity
				System.out.println("a value "+a);
			}catch(ArithmeticException ex){
				System.err.println("Must not divided by 0");
			}*/

		}catch(ArrayIndexOutOfBoundsException ex){
			System.err.println("Please do not pass morethan 2 values in array...");	
		}catch(NullPointerException nullExcep){
			System.err.println("Please enter your name");
		}catch(NumberFormatException ex ){
			System.err.println(ex.getMessage());
		}catch(Exception ex ){
			ex.printStackTrace();
		}finally{
			System.out.println("Finally block");
		}
		System.out.println("Ended");

	}
}
