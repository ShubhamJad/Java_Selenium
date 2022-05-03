package Collection;

public class String1 {

	
	public static void main (String [] args ) {
		
		
		String abc  = "Pune";
		String xyz = "Mubmai";
		String b = "Delhi";
		
		String c = abc.concat(xyz);
		System.out.println(c);
		String d = b.concat(c);
		System.out.println(d);
		
	    String e = "i am learing selenium automation";
	    System.out.println(e.substring(5,15));
	    
	    System.out.println(e.contains("len"));
	    
	    System.out.println(e.contains("sam"));  
		
		System.out.println(e.replace("a", "A"));
		
		String g = e.replace("a", "A");
		
		System.out.println(g);
		
		
		
	}
	
}
