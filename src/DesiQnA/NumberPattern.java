package DesiQnA;
import java.util.Scanner;

public class NumberPattern {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("How many line you want to  print triangle");
		int n =sc.nextInt();
		for(int row =1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col);
			}
			System.out.print("\n");
		}
	}

}