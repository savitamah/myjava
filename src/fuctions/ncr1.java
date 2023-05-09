package fuctions;
import java.util.Scanner;

public class ncr1 {
	//to print factorial
	public static int factorial(int n) {
		int ans=1;
		for(int i=1; i<=n; i++) {
			ans=ans*i;
		}
		return ans;
	}
	//to print prime number
	public static boolean isPrime(int n) {
		int d=2;
		while(d<n) {
			if(n%d==0) {
			return false;
		}
		 d++;
	}
	 return true;
	}
	//to print number 1 to n
	public static void inTillN(int n) {
		for(int i=1; i<=n; i++) {
			if(n<=0) {
				return;
			}
			System.out.println(i);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int n2=sc.nextInt();
	    inTillN(n2);
        boolean isPrime1=isPrime(13);
		
		System.out.println(isPrime1);
	
		int num=factorial(n);
		int den=factorial(r);
		int den1=factorial(n-r);
		int ans=num/(den * den1);
		System.out.println(ans);
		
		
	}

}
