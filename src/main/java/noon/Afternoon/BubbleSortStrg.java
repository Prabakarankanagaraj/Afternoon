package noon.Afternoon;

import java.util.Arrays;

public class BubbleSortStrg {
	static public void soRt(String[] ar)
	{
		String third=null;
		for(int step=0;step<ar.length-1;step++)
		{
			for(int cur=0;cur<ar.length-step-1;cur++)
			{
				if(ar[cur].compareTo(ar[cur+1])>0)
				{
					third=ar[cur];
					ar[cur]=ar[cur+1];
					ar[cur+1]=third;
				}
				}
			}
	}
	public static void main(String[] args) {
		String [] Name= {"praba","sil","anu","gow","gopi"};
		System.out.println(Arrays.toString(Name));
		BubbleSortStrg.soRt(Name);
		System.out.println("After Bubble : "+Arrays.toString(Name));
	}

}
