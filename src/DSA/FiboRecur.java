package DSA;

public class FiboRecur {
	public static void show(int a, int b, int n) {
		if(n==0) {
			return;
		}
		
		int c=a+b;
		System.out.println(c);
		show(b,c, n-1);
	}
		
		
		
	
	public static void main(String args[]) {
		int a=0;
		int b=1;
			System.out.println(a);
			System.out.println(b);
		int n=7;
		show(a, b, n-2);
		
	}

}
