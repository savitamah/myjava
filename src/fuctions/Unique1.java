package fuctions;
import java.util.Scanner;
public class Unique1 {
	public static void target() {
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	   while(t!=0) {
		 int arr1[]=takeInput(); 
	    int n= findUnique(arr1);
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
	    
	    public static int findUnique(int[] arr){
	    	
	        for(int i = 0; i < arr.length; i++) {
	            int j;
	            for(j = 0; j < arr.length; j++) {
	                if(i != j) {
	                    if(arr[i] == arr[j]) {
	                        break;
	                    }
	                }
	            }
	            if(j == arr.length) {
	                return arr[i];
	            }
	        }

	        /*
		    	The function would never return from this line 
	    		since the input array always contains a unique value. 

	    		To avoid the ambiguity at the compile time,
	    		the function necessarily has to return a value in case
	    		the line number 22 doesn't return the desired value during
	    		the execution of the for loop.
	        */
	        return Integer.MAX_VALUE;
	    }
	

 public static void main(String args[]) {
	 target();
 }
}