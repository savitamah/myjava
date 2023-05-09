package fuctions;
import java.util.Scanner;


public class ncr {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int n1=1;
		for(int i=1; i<=n;i++) {
			n1=n1*i;
		}
		int den=1;
		for(int i=1; i<=r;i++) {
			den=den*i;
		}
		int den1=1;
		for(int i=1; i<=n-r;i++) {
			den1=den1*i;
		}
		int ans=n1/(den1*den);
		System.out.println(ans);
		
	}

}
