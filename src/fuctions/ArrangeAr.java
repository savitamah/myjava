package fuctions;
import java.util.Scanner;
public class ArrangeAr {
	public static void  target() {
	Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t!=0) {
			 linearSearch();
			 
		
		
		
		 t--;
	}

	}
	
	  
		
	    

	    public static void linearSearch() {
	    		//Your code goes here
	    	  Scanner sc=new Scanner(System.in);
	    	 int  size=sc.nextInt();
	    	  int size1=size+1;
	 		 int input[]=new int[size1];
			  for(int i=1; i<size1; i++) {
				 if(i%2!=0) {
					 input[i]=i;
					System.out.print(input[i]); 
					
				 }
				
			 }
			  for(int i=size; i>=2; i--) {
				  if(i%2==0) {
					  input[i]=i;
					  System.out.print(input[i]);
				  }
				  
			  }
			
			  
		
			
			  }
	
	
	public static void main(String args[]) {
		target();
		
	}
	
}
