package fuctions;
import java.util.Scanner;
public class linearAr {
	public static void  target() {
	Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t!=0) {
		 int arr1[]=takeInput(); 
			int n=sc.nextInt();
			int index= linearSearch(arr1, n);
			 System.out.println(index);
		
		
		
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

	    public static int linearSearch(int input[], int x) {
	    		//Your code goes here
	    	 Scanner sc=new Scanner(System.in);
			  for(int i=0; i<input.length; i++) {
				 if(x==input[i]) {
					return i;
					
				 }
				
				
			 }
			 return -1;
			  
		
			
			  }
	
	
	public static void main(String args[]) {
		target();
		
	}
	
}
