package fuctions;

import java.util.Scanner;
public class AlternateSwap{
	public static void  target() {
	Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t!=0) {
		 int arr1[]=takeInput(); 
			
		  swapAlternate(arr1);
			 
		
		
		
		 t--;
	}

	}
	
	    public static int[] takeInput() {
		Scanner sc1=new Scanner(System.in);
		 int size=sc1.nextInt();
		 int input[]=new int[size];
		 for(int i=0; i<size; i++) {
		 input[i]=sc1.nextInt();
		
			 }
			 
	   return input;
		
	    }

	    public static void swapAlternate(int input[]) {
	    		//Your code goes here
	    	 Scanner sc=new Scanner(System.in);
			  for(int i=0; i<(input.length-1); i=i+2) {
					 int temp;
					 temp=input[i];
					input[i]=input[i+1];
					 input[i+1]=temp;
					 System.out.print(input[i]);
					 System.out.print(" ");
					 System.out.print(input[i+1]);
					 System.out.print(" ");
				  }
			    
				 
				  }
				 
					
				 
				
				
			 
			
			  
		
			
			  
	
	public static void main(String args[]) {
		target();
		
	}
	


				
				 
					
				 
				
				
			 
			
			  
		
			
			  }
	
	
	
	
