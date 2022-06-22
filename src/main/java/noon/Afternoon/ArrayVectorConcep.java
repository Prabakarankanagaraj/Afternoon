package noon.Afternoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class ArrayVectorConcep {
	public static void main(String[] args) {
		ArrayList<Character> scan=new ArrayList<Character>();
		Vector<Character> scan1=new Vector<Character>();
		scan1.add('a');scan1.add('g');scan1.add('c');scan1.add('f');
		scan1.add('t');scan1.add('y');
		System.out.println("vetcor : "+scan1);
		scan.addAll(scan1);
		System.out.println("Array : " +scan);
		scan.add(3, 'd');
		scan1.set(2, 's');
		System.out.println(scan);
		System.out.println(scan1);
		System.out.println(scan.remove(2));
		scan.retainAll(scan1);
		System.out.println(scan);
		scan1.removeAll(scan);
		System.out.println(scan1);
		Collections.sort(scan);
		System.out.println(scan);
		Collections.reverse(scan1);
		System.out.println(scan1);
		System.out.println(Collections.max(scan));
		System.out.println(Collections.min(scan));
		Collections.replaceAll(scan, 'a', 's');
		System.out.println((scan));


		
	}

}
