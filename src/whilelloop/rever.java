package whilelloop;

import java.util.Scanner;
public class rever {
	
	public static void main(String[] args) {
		// Write your code here
	    int rev=0;
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
         if(n>0) {
         int n1=n%10;
        rev=10*rev+n1;
        System.out.print(rev);
      
        }
        n=n/10;
     

	}
	 
	  
}
