package fuctions;
import java.util.Scanner;
public class ArrangeAr1 {
	public static void  target() {
	Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t!=0) {
		 int arr[]=takeInput();
		 int size=arr.length;
			 arrange(arr, size);
			 
		
		
		
		 t--;
	}

	}
	public static int[] takeInput() {
		 Scanner sc=new Scanner(System.in);
     	 int  size=sc.nextInt();
  
     	
   	 
		 int input[]=new int[size+1];
		 return input;
	}
	
	  
		
	    

	    public static void arrange(int input[], int size) {
	    		//Your code goes here	    	
	    
			  for(int i1=0; i1<size; i1++) {
				 if(i1%2!=0) {
					 input[i1]=i1;
					System.out.print(input[i1]+" "); 
					
				 }
				
			 }
			
			  for(int i=size-1; i>=2; i--) {
				  if(i%2==0) {
					  input[i]=i;
					  System.out.print(input[i]+" ");
				  }
				  else {
					  continue;
				  }
				  
			  }
			
			  
		
			
			  }
	
	
	public static void main(String args[]) {
		target();
		
	}
}
	