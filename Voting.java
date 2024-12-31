package CustomException;

public class Voting {

	public static void vote(int age) throws InvalidAgeException {

		if (age < 18) {
			throw new InvalidAgeException("You are not eligible to vote.");
		} else {
			System.out.println("You are eligible to vote");
		}

	}

}
