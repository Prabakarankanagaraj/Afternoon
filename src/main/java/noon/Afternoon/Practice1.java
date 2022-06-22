package noon.Afternoon;

import java.util.Arrays;

public class Practice1 {
	public static int sort(int[] rec,int start,int end)
	{
		int pidata=rec[end];
		int initial=start-1;
		for(int cur=start;cur<end;cur++)
		{
			if(rec[cur]<pidata)
			{
				initial++;
				int third=rec[cur];
				rec[cur]=rec[initial];
				rec[initial]=third;
				}
		}
		int third=rec[initial+1];
		rec[initial+1]=rec[end];
		rec[end]=third;
		
		return initial +1;
	}

	public static void hello(int[] re,int start,int end)
	{
		if(end>start)
		{
			int pipoint=sort(re,start,end);
			hello(re,start,pipoint-1);
			hello(re,pipoint+1,end);
		}
	}
		
		
	public static void main(String[] args) {
		int[] no= {80,10,98,87,5,17};
		hello(no,0,no.length-1);
		System.out.println(Arrays.toString(no));
		
		
	}
}



