package noon.Afternoon;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class CollectionConcep {
	public static void main(String[] args) {
//		HashMap<Integer, String> movies=new HashMap<Integer, String>();
//		movies.put(2020,"BEAST");movies.put(2011,"KGF");
//		movies.put(2012,"RRR");movies.put(2002,"VEDHA");
//		System.out.println(movies);
//		TreeMap<Integer, String> films=new TreeMap<Integer, String>();
//		films.putAll(movies);
//		System.out.println(films);
//		films.remove(2012);
//		System.out.println(films);
//		System.out.println(movies.containsKey(2012));
//		System.out.println(films.containsValue("RRR"));
//		Collection<String> name=movies.values();
//		System.out.println("Names are : "+name);
//		Set<Integer> year=films.keySet();
//		System.out.println("years are :"+year);
		HashMap<String, String[]> tamil=new HashMap<String, String[]>();
		tamil.put("Vijay",new String[]{"beast","Bigil","master"});
		tamil.put("ajith", new String[]{"Vivegam","Viswasam","veeram"});
		tamil.put("kamal", new String[]{"Enthiran","2.0","Linga"});
		for(String h:tamil.keySet())
		{
			System.out.println(h+" "+Arrays.toString(tamil.get(h)));
		}
		
		
	}
}
