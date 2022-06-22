package noon.Afternoon;

import java.util.Arrays;

public class BinSortarr {
	static public void selsction(int[] ar)
	{
		 int third=0;
		for(int hold=0;hold<ar.length;hold++)
		{
			for(int com=hold+1;com<ar.length;com++)
			{
			  	if(ar[hold]>ar[com])
			{
				third=ar[hold];
				ar[hold]=ar[com];
				ar[com]=third;
			}
		}
		}
	}
	public static void main(String[] args) {
		int[] no= {7,23,96,49,36};
		BinSortarr.selsction(no);
		System.out.println(Arrays.toString(no));
		
		
	}
}
