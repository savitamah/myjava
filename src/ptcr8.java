import java.util.Scanner;
public class ptcr8 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=n-i) {
			System.out.print(" ");
			j++;
			}
			j=1;
			int start=i;
			
			while(j<=i) {
			
				System.out.print(start);
				start++;
				j++;
				
			}
			 
	            j=1;
	            int p=2*i-2;
	          
	           while(j<=i-1)
	           {
	        	  
	        	 
	        	  
	               System.out.print(p);
	               j++;
		            p--;
	               
	           }
	            
			System.out.println("");
			i++;
		}
		
	}

}
