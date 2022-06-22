package noon.Afternoon;

import java.util.Arrays;
import java.util.Scanner;

public class chanGe {
	static Scanner obj=new Scanner(System.in);
	public static void upcal(int[] arr,int pos) {
		System.out.println(" postion to update :"+pos);
		arr[pos]=obj.nextInt();
	}
	public static void main(String[] args) {
		int[] no= {1,2,2,4,5};
		chanGe.upcal(no, 2);
		

	   System.out.println(Arrays.toString(no));
	}

}
