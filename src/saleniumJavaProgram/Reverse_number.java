package saleniumJavaProgram;

public class Reverse_number {
	
public void demo() {
	int n=124 ;
	int a=0;
	int digit;
	
	
	while(n>0) {
		digit=n%10;
		a=a*10+digit;
		n=n/10;
	}
	System.out.println(a);
	}
	public static void main(String[]args) {
		Reverse_number a=new Reverse_number();
		a.demo();
	
}
}