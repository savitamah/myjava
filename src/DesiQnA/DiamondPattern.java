package DesiQnA;
import java.util.Scanner;
public class DiamondPattern {
 public static void main(String args[]) {
				Scanner sc=new Scanner(System.in) ;
				System.out.println("How many line you want to  print triangle");
				int n =sc.nextInt();
				for(int row =1; row<=n; row++) {
					for(int space=0; space<n-row; space++) {
						System.out.print(" ");
						
					}
					
					for(int col=0; col<row; col++) {
						System.out.print("*"+" ");
					}
					System.out.println("");
				}
				for(int row =n; row>0; row--) {
					for(int space=0; space<n-row; space++) {
						System.out.print(" ");
					}
					
					for(int col=row; col>0; col--) {
						System.out.print("*"+" ");
					}
					System.out.println("");
				}
				
				
					
					
					
				}
			}

		