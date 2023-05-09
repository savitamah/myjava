package whilelloop;
import java.util.Scanner;
public class ptr7 {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            j=1;
            int p=i-1;
            while(j<=i-1) {
            	System.out.print("*");
            	p--;
            	j++;
               	
            	
            }
            System.out.println(" ");
            i++;
        }
        

		
	}

}
