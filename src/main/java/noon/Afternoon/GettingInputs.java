package noon.Afternoon;

import java.util.Scanner;

public class GettingInputs {
	public static void main(String[] args) {
		Scanner getting=new Scanner(System.in);
		System.out.println("Please Submit Your Details");
		System.out.println("Enter Your name :");
		String name=getting.next();
		System.out.println("Enter your Qualification :");
		String qualification=getting.next();
		System.out.println("what are the skills you have :");
		String skills=getting.next();
		System.out.println("Have you attend any interview Before:");
		String interview=getting.next();
		System.out.println("Thanks for Submitting your details,our team will contact You!!.");
		
		getting.close();
	}

}
