package DSA;

import java.util.Scanner;
public class CheckRotate{  
    public static void NoOfTestCase(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
        while(t!=0){
            int arr[]=takeInput();
          arrayRotateCheck(arr);
         
            
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
        

    public static int  arrayRotateCheck(int[] arr) {
    	for(int i=0; i<arr.length-1; i++) {
    		if(arr[i]>arr[i+1])
    		{
    			System.out.print(i+1); 
    		}
    	}
    	return 0;
           
          
    	
    	}
    		
    public static void main(String args[]) {
    	NoOfTestCase();
    }

}