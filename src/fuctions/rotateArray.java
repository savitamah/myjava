package fuctions;

import java.util.Scanner;
public class rotateArray {  
    public static void NoOfTestCase(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
        while(t!=0){
            int arr[]=takeInput();
             int d1=sc.nextInt();
            rotate(arr, d1 );
            
        }
    }
        public static int[] takeInput() {
			Scanner sc1=new Scanner(System.in);
			 int size=sc1.nextInt();
			 int arr[]=new int[size];
			 for(int i=0; i<size; i++) {
			 arr[i]=sc1.nextInt();
			 }
			 return arr;


    }
        

    public static void rotate(int[] arr, int d) {
    	int n=arr.length;
    	int temp[]=new int[d];
    	for(int i=0; i<d;i++) {
    		temp[i]=arr[i];
    		
    	}
        
    	for( int  i=d; i<n; i++) {
    		arr[i-d]=arr[i];
    		System.out.print(arr[i-d]+" ");
    		
    	}
    	
    	for( int i=0; i<d; i++) {
    		arr[i+n-d]=temp[i];
    		System.out.print(arr[i+n-d]+"");
    	}
    	
    	}
    		
    public static void main(String args[]) {
    	NoOfTestCase();
    }

}