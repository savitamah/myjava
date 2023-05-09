package DesiQnA;
import java.util.Scanner;

public class squarePattern {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("How many line you want to  print square");
		int n =sc.nextInt();
		for(int row =0; row<n; row++) {
			for(int col=0; col<n; col++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
