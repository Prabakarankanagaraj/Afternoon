package noon.Afternoon;

import java.util.TreeSet;

public class TreeConcep {
	public static void main(String[] args) {
		TreeSet<report> show=new TreeSet<report>();
		report s1=new report(); s1.name="sil";s1.std=10;s1.result="pass";
		report s2=new report();s2.name="praba";s2.std=10;s2.result="pass";
		report s3=new report();s3.name="anu";s3.std=11;s3.result="pass";
		show.add(s1);show.add(s2);show.add(s3);
		System.out.println(show);
		
 	}

}
class report implements Comparable<report>
{
	@Override
	public String toString() {
		return "report [name=" + name + ", std=" + std + ", result=" + result + "]";
	}
	public String name;
	public Integer std;
	public String result;
	@Override
	public int compareTo(report s) {
		// TODO Auto-generated method stub
		
		return this.result.compareTo(s.name);
	}
}
