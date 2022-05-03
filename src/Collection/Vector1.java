package Collection;

import java.util.Collections;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		   
		
		      Vector v1 = new Vector ();
		      
		      Vector v2 = new Vector (12);
		      
		      Vector v3 = new Vector (10,20);
		       
		      Vector v4 = new  Vector (v1);
		      
		      
		      v1.size();
		      
		      v1.capacity();
		      
		      System.out.println(v1);
		      System.out.println(v1);
		      
		      v1.add(5);
		      v1.addElement(33);
		      
		      
		     System.out.println(v1);  
		     
		      v1.capacity();
		      
		      
		      System.out.println(v1);
		      
		      for(int i = 0 ; i<=10 ; i++) 
		    	  
		    	  v1.add(i);
		    	  System.out.println(v1);
		      v1.size();	  
		   System.out.println(v1.capacity());
		   
		     System.out.println("***********************************");
		     
		     v2.add(200);
		     v2.addElement(15);
		     
		     
		     System.out.println(v2.capacity());
		     
		    for(int i = 0 ; i<=12;i++)
		     
		      v2.add(i);
		    System.out.println(v2);
		     
		     System.out.println("v2 Capacity =" + v2.capacity());
		     
		     System.out.println("***********************************");
		     
		     v3.add(55);
		     
		     for(int i = 0 ; i<=10;i++)
		    	 
		    	 v3.add(i);
		     System.out.println(v3);
		     System.out.println("V3 Capacity = " + v3.capacity());
		     
		     
		     Collections.reverse(v1);
		   
		   System.out.println(v1);
		   
		      v1.setElementAt(55, 02);
		    	  
		    System.out.println(v1);  
		    	  
		      
		    	  
		    	  
          
	}

}
