package DSA;

import java.util.Scanner;
public class SecondLargest{  
    public static void NoOfTestCase(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
        while(t!=0){
            int arr[]=takeInput();
            secondLargestElement(arr);
            
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
        

    public static void  secondLargestElement(int[] arr) {
    	int l=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
           
          for(int i=0; i<arr.length; i++){
        	   if(arr[i]>l){
        		  s=l;
                  l=arr[i];
               }
              else {
            	  if(arr[i]>s && arr[i]!=l) {
            		  s=arr[i];
            	  }
              }
              
            }
          
          
          System.out.print(s);
          
    	
    	}
    		
    public static void main(String args[]) {
    	NoOfTestCase();
    }

}