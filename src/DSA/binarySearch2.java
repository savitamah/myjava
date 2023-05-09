package DSA;
import java.util.Scanner;
public class binarySearch2 { 
	
public static int[] takeInput() {
			Scanner sc1=new Scanner(System.in);
			 int size=sc1.nextInt();
			 int arr[]=new int[size];
			 for(int i=0; i<size; i++) {
			 arr[i]=sc1.nextInt();
			 }
			 return arr;
	}
     public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
    	 int start=0;
    	 int end=arr.length;
    	 int mid=(start+end)/2;
    	 while(start<end) {
    		 if(x==arr[mid]) {
    			 return mid;
    		 }
    		 else if(x>arr[mid]) {
    			 start=mid+1;
    		 }
    		 else {
    			 end=mid;
    			 
    		 }
    		
    		 
    		
    	 }
    	 return -1;
    	
    }
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 int arr1[]=takeInput(); 
    	 int n=sc.nextInt();
		 int binarySearch1= binarySearch(arr1, n);
		 System.out.println(binarySearch1);
		 
     }
}