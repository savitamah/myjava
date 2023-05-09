package fuctions;

import java.util.Scanner;
public class Triplet{

public static void target() {
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  
	   while(t!=0) {
		 int arr1[]=takeInput();
		 int x=sc.nextInt();
		 pairSum(arr1,x);
	   

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
public static int pairSum(int input[], int x) {
  	//Your code goes here
	int c=0;
	 for(int i=0;i<input.length; i++) {
		   for(int j=i+1; j<input.length; j++) {
			   for(int k=j+1;k<input.length; k++) {
			   int n=input[i]+input[j]+input[k];
			   if(n==x) {
				   c++;
			   }
			
			   }
	 }
		 
	 }
	 return c;
	
  }
public static void main(String args[]) {
	 target();
}
}
	    