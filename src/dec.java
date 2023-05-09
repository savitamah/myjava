import java.util.Scanner;
import java.lang.Math;
public class dec {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dec=0 ,i=0;
        while(n!=0) {
        int  b=n%10;
         n=n/10;
         
          int n2=(int)Math.pow(2, i);
           dec=dec+ n2*b;
           i++;
        
        }
        System.out.print(dec);
    
        }
        
        

	}


