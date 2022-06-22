package noon.Afternoon;

import java.util.Stack;

public class StackConcep {
	public static void main(String[] args) {
		Stack obi=new Stack();
		obi.push("praba");
		obi.push(5);
		obi.push(10.5);
		obi.push('s');
//		System.out.println(obi); 
//		for(Object o:obi)
//		{
//			System.out.println(o);
//		}
		System.out.println(obi.pop());
		System.out.println(obi.peek());
		System.out.println(obi.search(5));
		obi.clear();
		System.out.println(obi.isEmpty());
	}

}
