
package noon.Afternoon;

import java.util.Scanner;

public class Newtest {
	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("Submit your ITR-2022");
		System.out.println("Enter Your name :");
		String name=o.next();
		System.out.println("Enter Your Profession :");
		String professiuon=o.next();
		System.out.println("Enter Your annual Income :");
		double income=o.nextDouble();
		System.out.println("enter your Email :");
		String email=o.next();
		System.out.println("Enter Your Mobile No :");
		Long mobile=o.nextLong();
		System.out.println("Thanks for submitting Your ITR 2022 Mr"+name);
		
		
		
		
		
		
		o.close();
	}

}
