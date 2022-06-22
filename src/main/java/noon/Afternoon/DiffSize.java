package noon.Afternoon;

import java.util.Arrays;

public class DiffSize {
	public static void main(String[] args) {
		int[] value= {1,2,12,14,7,6,8,10};
		float[] val=new float[3];
		for(int pos=0;pos<val.length;pos++)
		{
			val[pos]=(float)value[pos];
		}
		System.out.println(Arrays.toString(val));
		int[] no=new int[value.length];
		no=Arrays.copyOfRange(value, 0, no.length);
		System.out.println(Arrays.toString(no));
	}

}
































