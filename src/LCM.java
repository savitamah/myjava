import java.util.Scanner;

public class LCM {
	public static int Lcm(int a, int b) {
		int lcm;
		int gcd =1;
		 for(int i=1; i<=a && i<=b; i++) {
				if(a%i==0 && b%i==0) {
					 gcd=i;
			}
				
				
				}
			lcm=(a*b)/gcd;
		    return lcm;
			 
		   
		}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int  a1=sc.nextInt();
		int  b1=sc.nextInt();
		LCM lcm=new LCM();
		int n=lcm.Lcm(a1, b1);
		System.out.print(n);
		
	
	}
	

}
