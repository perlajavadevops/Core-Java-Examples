import java.io.IOException;


public class ExceptionDemo2 {

	public static  void getFileName() throws ValidateNumberException{
		try{
		String name  = "R";
		int a = Integer.parseInt(name);
		System.out.println("Hi "+a);
		if(a==0){
			throw new ValidateNumberException("Please enter numbers....");
		}else{
			throw new NumberFormatException("Please enter only numbers....");
		}
		}catch(ValidateNumberException nuE){
			throw new ValidateNumberException("Please enter numbers....");

		}
		
	}
	
	public static void main(String[] args){
		try {
			getFileName();
		} catch (ValidateNumberException e) {
			System.err.println(e.getMessage());
		}
	}
	
}
