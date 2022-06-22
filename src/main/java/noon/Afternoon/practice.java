package noon.Afternoon;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
  public static int search(String[] rec,String user)
  {
	  for(int pos=0;pos<rec.length;pos++)
	  {
	  if(rec[pos].equalsIgnoreCase(user)) {
		  return pos;
	  }
  }
	return 0;
	  
  }
  public static void print(int start,int end) {
	  if(end>=start) {
		  System.out.println("praba");
		  practice.print(start+1, end);
	  }
		  
	  }
  public static void recur(String[] ar,int start,int end) {
	  if(end>start)
	  {
		  System.out.println(ar[start]);
		  practice.recur(ar, start+1, end);
	  }

  }
 
	
	public static void main(String[] args) {
		String[] name= {"praba","sil","anu","Gopi","nantha"};
		System.out.println(practice.search(name, "nantha"));
		practice.print(1, 10);
		practice.recur(name, 1, 4);
		 
 
		 
	}
}
//		Scanner scan=new Scanner(System.in);
//		System.out.println("tell us position to get a name :");
//		int pos=scan.nextInt();
//		System.out.println("position of"+pos+"is"+name[pos]);
//		System.out.println("tell us phrase");
//		String phrase=scan.next();
//		
//		for(String point:name) {
//			if(point.startsWith(phrase))
//			{
//				System.out.println(point);
//			}
//		}
//		
//		}

  