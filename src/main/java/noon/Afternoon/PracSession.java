package noon.Afternoon;

import java.util.Comparator;
import java.util.TreeSet;

class PracSession {
	 public static void main(String[] args) {
		 TreeSet<mobile> set=new TreeSet<mobile>();
		 mobile m1=new mobile(); m1.name="Asus";m1.price=100.0;
		 m1.ram=2;m1.storge=64;
		 mobile m2=new mobile(); m2.name="mi";m2.price=80.0;
		 m2.storge=32;m2.ram=4;
		 mobile m3=new mobile(); m3.name="vivo";m3.price=85.0;
		 m3.storge=128;m3.ram=6;
		 mobile m4=new mobile(); m4.name="oppo";m4.price=45.0;
		 m4.storge=16;m4.ram=8;
		 set.add(m1);set.add(m2);set.add(m3);set.add(m4);
		 System.out.println(set);
	}
	


	
		
	}
 class mobile implements Comparable<mobile>  {
	 @Override
	public String toString() {
		return "mobile [name=" + name + ", price=" + price + ", storge=" + storge + ", ram=" + ram + "]";
	}
	public String name;
	 public Double price;
	 public Integer storge;
	 public Integer ram;
	@Override
	public int compareTo(mobile o) {
		// TODO Auto-generated method stub
		return o.price.compareTo(this.price);
		
	}

	}

			
		
		
	

	