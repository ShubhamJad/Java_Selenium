package Collection;

import java.util.ArrayList;

        public class ArrayList1 {

	
	    public static void main(String [] args) {
	
	
	    ArrayList anup = new ArrayList();
	
        ArrayList anup1 = new ArrayList(1000);
    
        ArrayList anup2 = new ArrayList(anup1);
	
	
	    System.out.println(anup.size());
	
	    System.out.println(anup1.size());
	
	    System.out.println(anup2.size());
	
	    anup.add(10);
	
	    System.out.println(anup);
	
	    anup.add("Shubham");
	
	    System.out.println(anup);
	    
	    anup.add( "sam");
	 
	    System.out.println(anup);
	
	
	    anup.add("sanket");
	    
	    System.out.println(anup);
	    
	    anup.add(2, "axay");
	    
	    System.out.println(anup);
	    
	    anup.add("Sheru");
	    
	    System.out.println(anup);
	    
	    anup.add(3,"Gaurav");
	    
	    
	    System.out.println(anup);
	    
	    
	    
	    
	    
	}
}
