import java.util.Scanner;
public class prime {
	public static void main(String args[]) {
		int i=2;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(i<n) {
			if(n%i==0) {
				System.out.println("Not prime");
				return;

				
			}
			
			i++;
		
		
		}
		System.out.println("Prime Number");
		
		

		
	}

}
