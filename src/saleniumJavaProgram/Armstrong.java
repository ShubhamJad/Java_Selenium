package saleniumJavaProgram;

public class Armstrong {	public void demo() {
	int n=371 ;
	int a=0;
	int digit;
	
	
	while(n>0) {
		digit=n%10;
		a=digit*digit*digit+a;
		n=n/10;
	}
	System.out.println(a);
}
	public static void main(String[]args) {
		Armstrong a=new Armstrong();
		a.demo();
	}

}
