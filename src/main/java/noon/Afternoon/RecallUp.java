package noon.Afternoon;

import java.util.Arrays;
import java.util.Scanner;

public class RecallUp {
	static Scanner scan=new Scanner(System.in);
	public static void Up(int[] arr, int pos)
	{
		System.out.println("Which Pos need to update :"+pos);
		arr[pos]=scan.nextInt();
	}
	public static void main(String[] args) {
		int[] nos= {1,2,2,4,5};
//		for(int i=0;i<nos.length;i++)
//		{
//			System.out.println(nos[i]);
//		}
		RecallUp.Up(nos, 2);
	
		System.out.println(Arrays.toString(nos));
	}
	

}
