package fuctions;

import java.util.Scanner;
public class sortAsc{

public static void target() {
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  
	   while(t!=0) {
		 int arr1[]=takeInput();
		
		 sortZeroesAndOne(arr1);
	   

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
public static void sortZeroesAndOne(int[] input) {
	//Your code goes here
	 int count=0;
		for(int i=0;i<input.length;i++)
     {
         if(input[i]==0)
         {
             count++;
         }
     }
     for(int i=0;i<count;i++)
     {
         input[i]=0;
         System.out.print(input[i]);
     }
     for(int i=count;i<input.length;i++)
     {
         input[i]=1;
         System.out.print(input[i]);
     }


	}

	
	
	
	
	
	
		
		


public static void main(String args[]) {
	 target();
}
}
	    