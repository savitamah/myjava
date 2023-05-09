package DesiQnA;
	import java.util.Scanner;

	public class reverseTrianglePattern {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in) ;
			System.out.println("How many line you want to  print triangle");
			int n =sc.nextInt();
			for(int row =n; row>0; row--) {
				for(int col=0; col<row; col++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}

	}