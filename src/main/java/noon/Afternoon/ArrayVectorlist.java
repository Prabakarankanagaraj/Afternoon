package noon.Afternoon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class ArrayVectorlist {
	public static void main(String[] args) {
		ArrayList<Character> list1=new ArrayList<Character>();
		Vector<Character>list2=new Vector<Character>();
		list1.add('a');list1.add('b');list1.add('c');
		list1.add('d');list1.add('e');
		System.out.println("ArrayList :"+list1);
		list2.addAll(list1);
		System.out.println("VectorList:"+list2);
		list1.add(3, 'm');list2.set(0, 'p');
		System.out.println(list1);
		System.out.println(list2);
		list1.remove(3);list2.remove((Object)'p');
		System.out.println(list1);
		System.out.println(list2);
		list1.retainAll(list2);
		System.out.println(list1);
		list2.removeAll(list1);
		System.out.println(list2);
		Collections.reverse(list1);
		System.out.println(list1);
		System.out.println(Collections.max(list1));
		Collections.replaceAll(list1, 'd', 'p');
		System.out.println(list1);
		
		
	
		
	}

}
