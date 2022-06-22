package noon.Afternoon;

import java.util.Arrays;

public class SortBinFunc {
	public void sort(int[] rec)
	{
		int third=0;
		for(int line=0;line<rec.length-1;line++)
		{
			for(int pos=0;pos<rec.length-line-1;pos++)
			{
				if(rec[pos]>rec[pos+1])
						{
					third=rec[pos];
					rec[pos]=rec[pos+1];
					rec[pos+1]=third;
					
						}
			}
		}
	}
	public static void main(String[] args) {

		int[] no= {24,12,35,7,9,4};
		System.out.println("Before Bubble : \n"+Arrays.toString(no));
		SortBinFunc obj=new SortBinFunc();
		obj.sort(no);
		System.out.println("After Bubble : \n"+Arrays.toString(no));
		
	}

}
