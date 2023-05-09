package fuctions;
import java.util.Scanner;

public class unique {
	public static void  target() {
	Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t!=0) {
		 int arr1[]=takeInput(); 
		 findUnique(arr1);
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
   for(int i=0; i<input.length; i++){
      for(int j=i+1; j<input.length; j++){
          if(input[i]==input[j]){
              break;
     }    

  }
      return input[i];
  
  }
return 0;

  }

}
