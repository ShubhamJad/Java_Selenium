package Collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String [] args) {
		
		
		ArrayList sam = new ArrayList();           // Default capacity =  10
		
		ArrayList sam1 = new ArrayList(1000);
		
		ArrayList sam2 = new ArrayList(sam1);
		
		System.out.println(sam.isEmpty());
		sam.add(10);
		
		sam.add("Shubham");
		
		sam.add("Anant");
		
		sam.add("Jadhav");
		
		sam.size();
		
		System.out.println(sam);
		
		System.out.println(sam.size());
		
		System.out.println(sam.lastIndexOf("Shubham"));
		
		System.out.println(sam.indexOf("Anant"));
		
		System.out.println(sam.contains("shubham"));
		
		System.out.println(sam.isEmpty());
		
		sam.set(1, "Anup");
		
		System.out.println(sam);
		
		sam.add("Shubham");
		
		System.out.println(sam);
		
		sam.add(null);
		
		System.out.println(sam);
		
	}
	
	
}
