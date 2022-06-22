package noon.Afternoon;

import java.util.Arrays;
import java.util.Scanner;

public class MetScan {
	public static void stu(String[] Name)
	{
		Scanner scan=new Scanner(System.in);
		for(int pos=0;pos<Name.length;pos++)

	{
			System.out.println("Enter name :"+pos);
			Name[pos]=scan.next();
			
	}
	}
	public static void main(String[] args) {
		String[] name=new String[4];
		System.out.println(Arrays.toString(name));
		stu(name);
		System.out.println(Arrays.toString(name));
	}

}
