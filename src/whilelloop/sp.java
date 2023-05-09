package whilelloop;

import java.util.Scanner;
public class sp {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int sum=0 ,mul=1;
        
        if(c==1){
            for(int i=1; i<=n; i++){
                sum=sum+i;
               
            }
            System.out.println(sum);
        }
        else if(c==2){
           
            for(int i=1; i<=n; i++){
                mul=mul*i;
              
            }
            System.out.println(mul);
        }
        else{
            System.out.println("-1");
        }
        
        

	}
}