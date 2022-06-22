package noon.Afternoon;

import java.util.LinkedList;

public class LinkedConcep {
	public static void main(String[] args) {
		LinkedList<String> link=new LinkedList<String>();
		link.add("praba");link.add("sil");link.add("anu");link.addFirst("gow");
		link.addLast("gopi");link.add(2,"nantha");
		System.out.println(link);
		System.out.println(link.getFirst());
		System.out.println(link.removeFirst());
		System.out.println(link.getFirst());
		System.out.println(link.set(1, "sil"));
		System.out.println(link);
		System.out.println(link.indexOf("sil"));
		
	}

}
