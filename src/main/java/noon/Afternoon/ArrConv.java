package noon.Afternoon;

import java.util.Arrays;

public class ArrConv {
	public static void c(char[] src,byte[] var)
	{
		for(int pos=0;pos<src.length;pos++)
		{
			var[pos]=(byte)src[pos];		}
	}
	public static void main(String[] args) {
		char[] ltr= {'a','b','c','d'};
		byte[] no=new byte[ltr.length];
		c(ltr, no);
		System.out.println(Arrays.toString(no));
		
		
	}

}
