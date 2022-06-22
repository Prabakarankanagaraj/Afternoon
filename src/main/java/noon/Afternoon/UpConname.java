package noon.Afternoon;

import java.util.Arrays;
import java.util.Scanner;

public class UpConname {
  static Scanner scan=new Scanner(System.in);
  static public void meth(String[] name,String nammatch)
  {
	  for(int pos=0;pos<name.length;pos++)
	  {
		  if(name[pos].contains(nammatch))
		  {
			  System.out.println("what name need to update :"+name[pos]);
			  name[pos]=scan.next();
		  }
		  
	  }
  }
	public static void main(String[] args) {
		String[] names= {"silviya","prabakaran","anupreethi","gowtham","gopinath"};
		UpConname.meth(names,"th");
		System.out.println(Arrays.toString(names));
	}
}
		
		
