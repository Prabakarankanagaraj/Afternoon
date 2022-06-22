package noon.Afternoon;

import java.util.Scanner;

public class Eachforloop {
	public static void main(String[] args) {
		String[] bike= {"Hero","Honda","RE","Fz","TVS","Yamaha"};
		Scanner scan=new Scanner(System.in);
//				System.out.println("Please Enter Your desired Position :");
//		int pos=scan.nextInt();
//		System.out.println("You have entered your desired position of "+pos+"is"+bike[pos]);
     System.out.println("plese enter which letter to start with");
     String ltr=scan.next();
     for(String pointer:bike)
     {
    	 if(pointer.startsWith(ltr))
    	 {
    		 System.out.println(pointer);
    	 }
     }
	}

}
