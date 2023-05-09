package fuctions;

import java.util.Scanner;

public class intersection {
	public static void target() {
		  Scanner sc=new Scanner(System.in);
		  int t=sc.nextInt();
		   while(t!=0) {
			 int arr1[]=takeInput(); 
			 int arr2[]=takeInput();
		     intersections(arr1,arr2);
		   
	
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
	 public static void intersections(int input[], int input1[]) {
	    	//Your code goes here
		 for(int i=0;i<input.length; i++) {
			 for(int j=0; j<input1.length; j++) {
			 if(input[i]==input1[j]) {
				   System.out.print(input[i]);
				   input1[j]=Integer.MIN_VALUE;
				   break;
			   }
		 }
		 }
		   
	    }
	 public static void main(String args[]) {
		 target();
	 }
	}
		    