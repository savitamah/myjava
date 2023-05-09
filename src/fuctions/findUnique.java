package fuctions;
import java.util.Scanner;
public class findUnique {
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
 public static int findUnique(int[] input){
		//Your code goes here
	 int c=0;
	 for(int i=0;i<input.length;i++){
         for(int j=0; j<input.length;j++){
             if(input[i]==input[j]) {
                 c++;
               }
         }
        if(c==1) {
             return input[i];
        }
      
       
	 }
	 return 0;
 }
	  
 
  public static void main(String args[]) {
	 target();
 }
}
