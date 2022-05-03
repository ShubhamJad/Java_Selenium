package saleniumJavaProgram;

import org.apache.poi.util.SystemOutLogger;

public class LogicalProgram {

	public static void main(String [] args) {
		
		String a = "Shubham Anant Jadhav";
		String splite[] = a.split(" ");
		
		for(String value:splite) {
			
		 System.out.println(value);
			
		}
	
		 // duplicate String in array
		
		  String a1 []  = {"Shubham" , "Anup" , "Shubham"};
		   
		   for (int i = 0; i < a1.length;i++) {
			   for(int j = i+1; j<a1.length; j++) {
				   if(a1[i] == a1 [j]) {
					   
			System.out.println(a1[j]);	   
					   
				   }
				   
				   
			   }
			   
			   
		   }
		
		
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
