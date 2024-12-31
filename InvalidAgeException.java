package CustomException;

public class InvalidAgeException extends Exception {

	
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String msg) {
		System.out.println(msg);
	}

}
