package noon.Afternoon;

import java.util.Arrays;

public class CallMethod{
	
	public static void c(String[] input) {
		System.out.println(Arrays.toString(input));
		input[2]+="Dell";
		System.out.println(Arrays.toString(input));
	}

//public static void a(int var)
//{
//	System.out.println(var);
//	var+=2;
//	System.out.println(var);
//	
//}


	public static void main(String[] args) {
		int m  A=2;
		String[] call= {"hp","dell","asus","lenovo"};
		
//		a(5);
//		c(3);
		c(call);
		//		a(A);
//		System.out.println(A);
		System.out.println(Arrays.toString(call));
//		System.out.println(A);

}

}