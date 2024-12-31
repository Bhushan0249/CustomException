package CustomException;

import java.util.Scanner;

public class ClassMain {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Your Age....");
		int age = s.nextInt();
		try {
			Voting.vote(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
//			System.out.println(e);
		}
		
		s.close();
	}
}
