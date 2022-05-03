package saleniumJavaProgram;

public class Febbunacci {

	public static void main(String[] args) {
		int num1 =1;
		int num2= 1;
		int count = 10;
		int num = 0;
		
		System.out.println(num1+""+num2);
		
		for(int i=2;i<=count;i++) {
			 num=num1+num2; 
			 num1=num2;
			 num2=num;
	 System.out.println(num +"");
	
			
		}

	}

}
