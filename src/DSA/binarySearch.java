package DSA;
import java.util.Scanner;
public class binarySearch { 
	
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
    	
        for(int i=0; i<arr.length; i++){
            int mid=(i+arr.length)/2;
            if(x==arr[mid]){
                return mid;
            }
            else if(x>arr[mid]){
                for(int i2=mid+1; i2<arr.length; i2++){
                    if(arr[i2]==x){
                        return i2;
                    }
                }
            }
            else if(x<arr[mid]){
                for(int i1=0; i1<mid; i1++){
                    if(arr[i1]==x){
                        return i1;
                    }
                }
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