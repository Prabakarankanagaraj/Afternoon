package noon.Afternoon;

public class SearchMeth {
	public static int linear(String[]arr,String name)
	{
		for(int pos=0;pos<arr.length;pos++)
		{
			if(arr[pos].equals(name))
			{
				return pos;
			}
		}
	return-1;	
	}
	public static void print(int start,int end)
	{
		if(end>=start)
		{
			System.out.println("praba"+start);
			SearchMeth.print(start+1, end);
		}
		return;
	}
	public static void recursive(String[] h,int start,int end)
	{
		if(end>start)
		{
			System.out.println(h[start]);
			SearchMeth.recursive(h, start+1, end);
		}
	}

	public static void main(String[] args) {
		String[] name= {"praba","sil","anu","gow","gopi"};
		System.out.println(SearchMeth.linear(name, "nantha"));
		SearchMeth.print(10,20);
		SearchMeth.recursive(name, 0, name.length);
		
	}

}
