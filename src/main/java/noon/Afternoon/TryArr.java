package noon.Afternoon;

import java.util.TreeSet;

public class TryArr {
	public static void main(String[] args) {
		TreeSet<bike> show=new TreeSet<bike>();
		bike b1=new bike();b1.name="praba";b1.model="suzuki";b1.Mileage=40.0f;
		b1.price=100;bike b2=new bike();b2.name="sil";b2.model="tvs";b2.Mileage=35.0f;
		b2.price=60;bike b3=new bike();b3.name="anu";b3.model="pept";b3.Mileage=20.0f;
		b3.price=30;bike b4=new bike();b4.name="gopi";b4.model="rx-100";b4.Mileage=39.90f;
		b4.price=125;
		show.add(b1);show.add(b2);show.add(b3);show.add(b4);
		System.out.println(show);
		 
		 
		  	}	
	}
class bike implements Comparable<bike>{
	public String name;
	public String model;
	public Integer price;
	public Float Mileage;
	
	@Override
	public String toString() {
		return "bike [name=" + name + ", model=" + model + ", price=" + price + ", Mileage=" + Mileage + "]";
	}

	@Override
	public int compareTo(bike Gow) {
		// TODO Auto-generated method stub
		return this.model.compareTo(Gow.model);
	}
} 