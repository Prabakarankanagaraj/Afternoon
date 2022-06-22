package noon.Afternoon;

import java.util.Scanner;

public class SingleArray {
	public static void main(String[] args) {
		Integer[] rank=new Integer[3];
		System.out.println(rank.length);
		String[] name= {"praba","sil","gowtham"};
		Scanner getting=new Scanner(System.in);
	for(int base=0;base<rank.length;base++)
		{
			System.out.println("Enter the rank :");
			rank[base]=getting.nextInt();
			System.out.println("The rank "+rank[base]+" "
					+" "+"is"+name[0])
			;
		}
//	for(Integer dummy:rank)
//	{
//		System.out.println(dummy);
//	}
		getting.close();
		
	}

}
