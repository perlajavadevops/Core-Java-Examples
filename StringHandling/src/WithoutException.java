
public class WithoutException {

	public static void main(String[] args) {
		System.out.println("Started");
		try{
			int[] arr = new int[2];
			arr[0] = 100;
			arr[1] = 200;
			//arr[2] = 300;//Here abnormally terma

			String s = "Hi";
			System.out.println(s.length());
			
			try{
				int a= 10/0;//infinity
				System.out.println(a);
			}catch(ArithmeticException ex){
				System.err.println(ex.getMessage());
			}
			
			int i = Integer.parseInt(s); //Wrapper classes Integer,Float, Double, Short, Byte, Boolean, Character, Long
		}catch(ArrayIndexOutOfBoundsException aiExce){
			System.err.println("Please do not pass morethan 2 values in array...");	
		}catch(NullPointerException nullExcep){
			System.err.println("Please enter your name");
		}/*catch (Exception exception){
			System.err.println(exception.getMessage());
		}*/finally{
			System.out.println("Finally block");
		}
		
		System.out.println("Handled");
	}
}
