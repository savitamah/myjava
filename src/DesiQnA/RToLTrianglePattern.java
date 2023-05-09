package DesiQnA;
import java.util.Scanner;

public class RToLTrianglePattern {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in) ;
			System.out.println("How many line you want to  print triangle");
			int n =sc.nextInt();
			int count=0;
			for(int space=0;space<count; space++) {
				System.out.print(" ");
			}
			count++;
			for(int row =0; row<n; row++) {
				for(int col=0; col<=row; col++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}

	}