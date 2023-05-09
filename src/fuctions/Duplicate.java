package fuctions;

import java.util.Scanner;
public class Duplicate {
	public static void target() {
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	   while(t!=0) {
		 int arr1[]=takeInput(); 
	    int n= duplicateNumber(arr1);
	    System.out.print(n);
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
	    
 public static int duplicateNumber(int input[]){
	    	
	        for(int i = 0; i < input.length; i++) {
	            int j;
	            for(j = 0; j < input.length; j++) {
	                if(i != j) {
	                    if(input[i] == input[j]) {
	                        return input[i];
	                    }
	                }
	            }
	           
	        }

	        return Integer.MAX_VALUE;
	    }
	

 public static void main(String args[]) {
	 target();
 }
}