
public class ValidateNumberException extends NumberFormatException{

	private String message = null;
	public ValidateNumberException(String message) {
		super(message);

		this.message = message;
	}
}
