package saleniumJavaProgram;

public class Pallidrome {
	public void demo() {
		int n=121 ;
		int a=0;
		int digit;
		int t=n;
		
		
		while(n>0) {
			digit=n%10;
			a=a*10+digit;
			n=n/10;
		}
		if(t==a) {
			System.out.println("number is pallidrome");
		}
		else {
			System.out.println("number is not pallidrome");
		}
	}
		public static void main(String[]args) {
			Pallidrome a=new Pallidrome();
			a.demo();
		
	}
	}


