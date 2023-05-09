package whilelloop;

import java.util.Scanner;
public class Main1 {
	
	public static void main(String[] args) {
		// Write your code here
        int even=0,odd=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit%2==0){
                even=even+digit;
              
            }
            else{
                odd=odd+digit;

            }
          
     
   
            
            
         
            
           
        }
        System.out.println(even+" "+odd);
    
     

	}
}