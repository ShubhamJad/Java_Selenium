package saleniumJavaProgram;

public class Reverse_string {
	public static void main(String[]args) {
		String straight ="anup";
		String reverse= "";
		
	char[]a =straight.toCharArray();
	System.out.println("given string are =" +straight);
	
   int length =straight.length();
   
   for(int i=length-1;i>=0;i--) {
	   reverse =reverse+a[i];
   }
   System.out.println("reverse string are="+reverse);
   
   
   
   
   
   
   
   
}
}