package noon.Afternoon;

import java.util.Arrays;

public class AccessMeth {
	
	public static void call(float rec) {
				System.out.println(rec);
				rec+=2;
				System.out.println(rec);
	}
	public static void arr(float[] var)
	{
		System.out.println(Arrays.toString(var));
		var[2]+=2;
				System.out.println(Arrays.toString(var));
	}
	public static void main(String[] args) {
		float a=2;
		call(a);
		System.out.println(a);
		float [] no= {1,2,3,4,5};
		arr(no);
		System.out.println(Arrays.toString(no));	
		}

}
