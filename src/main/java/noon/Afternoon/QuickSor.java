package noon.Afternoon;

import java.util.Arrays;

public class QuickSor {
	public static int sort(int[] arr,int start, int end)
	{
		int pidata=arr[end];
		int initial=start-1;
		for(int cur=0;cur<end;cur++)
		{
			if(arr[cur]<pidata)
			{
				initial++;
				int third=arr[cur];
				arr[cur]=arr[initial];
				arr[initial]=third;
			}
			int third=arr[initial+1];
			arr[initial+1]=arr[end];
			arr[end]=third;
			
			return initial++;
		}
		public static void hello(int[] ar,int start,int end)
		{
			if(end>start)
			{
				int pipoint=sort(ar,start,end);
				hello(ar,start,pipoint-1);
				hello(ar,pipoint+1,end);
				
			}
		}
		
	}

	public static void main(String[] args) {
		int[] no= {20,40,30,10,60};
		hello(no, 0, no.length-1);
		System.out.println(Arrays.toString(no));
	}

}
