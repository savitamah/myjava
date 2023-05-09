package DSA;
import java.util.Scanner;
public class Selection {

	public static void target() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t!= 0) {
            int arr1[] = takeInput();
            selectionSort(arr1);
            t--;
        }
    }

 public static int[] takeInput(){
		  Scanner sc=new Scanner(System.in);
		  int size=sc.nextInt();
		  int arr[]=new int[size];
		  for(int i=0; i<size; i++) {
		    arr[i]=sc.nextInt();
		  }
		 
		  return arr;
 }

public static void selectionSort(int[] arr) {
	//Your code goes here
    for ( int i=0; i<arr.length; i++){
          int min=arr[i];
          int minIndex=i;
           for (int j=i+1; j<arr.length; j++){
               if(arr[j]<arr[minIndex]){
                   min=arr[j];
                   minIndex=j;
             }
           }
    
         arr[minIndex]=arr[i];
         arr[i]=min;
         System.out.print(arr[i]+ " ");
    }
          
    }
       public static void main(String args[]) {
    	   target();
       }
    	
}
   


