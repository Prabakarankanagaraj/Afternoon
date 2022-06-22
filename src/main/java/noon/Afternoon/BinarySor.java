package noon.Afternoon;

import java.util.Scanner;

public class BinarySor {
	 static public int Binary(int[] ar,int start,int end, int data)
	{
		if(end>=start)
		{
			int mid=(start+end)/2;
			if(ar[mid]==data)
			return mid;
			else if(ar[mid]>data)
				return Binary(ar, start, mid, data);
			
			else
					return Binary(ar,mid+1,end,data);
			
						}
		else 
			return -1;
	}
	 public static void main(String[] args) {
			int[] no= {1,2,3,4,5,6,7,8,9,10};
			System.out.println(BinarySor.Binary(no, 0, no.length, 10));
	
	}
	
	
	

}
