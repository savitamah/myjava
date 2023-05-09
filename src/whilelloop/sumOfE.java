package whilelloop;

import java.util.Scanner;

public class sumOfE{

	public static void main(String[] args) {
		
	
        int sum=0 , n;
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        for(n=0; n<=i; n++){
        if(n%2==0)
        {
            sum=sum+n;
         
        }
      
        }
        System.out.println(sum);
      

	}

}