public class CustomExceptionDemo {

	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException(
					"Your not eligible for vote becuase of your age");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		try {
			validate(12);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}finally{
			
		}

		System.out.println("rest of the code...");
	}
}
