
package DesiQnA;
import java.util.Scanner;

public class trianglePattern1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("How many line you want to  print triangle");
		int n =sc.nextInt();
		for(int row =0; row<n; row++) {
			for(int col=0; col<=row; col++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}