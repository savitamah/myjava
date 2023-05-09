import java.util.Scanner;
public class pt88 {
	public static void main(String args[]) {
		
	
		  Scanner scanner=new Scanner(System.in);
	        int n=scanner.nextInt();
	        for(int i=1; i<=n; i++){
	            for(int j=1; j<=n-i; j++){
	                System.out.print(" ");
	            }
	            int start=i;
	            for(int j=1; j<=i; j++){
	                System.out.print(start);
	                start++;
	            }
	            int p=2*i-2;
	            for(int j=1; j<=i-1; j++) {
	            	System.out.print(p);
	            	p--;
	            }
	            System.out.println(" ");
	        }
	       
	}    
}
	        