package whilelloop;
import java.util.Scanner;

public class SumOfN {
	public static void main(String args[])
	{
		int i=1, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N number where you want to find sum of that number");
		int n=sc.nextInt();
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println("sum"+sum);
		sc.close();
		
		
	}

}
