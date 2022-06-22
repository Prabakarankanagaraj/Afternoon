package noon.Afternoon;

import java.util.Scanner;

public class CarTesting {
	public static void main(String[] args) {
		
		Float[] mileage=new Float[3];
		System.out.println(mileage.length);
		Scanner scan=new Scanner(System.in);
		for(int Base=0;Base<mileage.length;Base++)
		{
			System.out.println("Enter your mileage :");
			mileage[Base]=scan.nextFloat();
			System.out.println("Your mileage is "+mileage[Base]);
		}
	}

}
