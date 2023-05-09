package DSA;

import java.util.Scanner;

public class PushAllZeroAtTheEnd {
	public static int[] takeInput() {
		Scanner sc1=new Scanner(System.in);
		 int size=sc1.nextInt();
		 int arr[]=new int[size];
		 for(int i=0; i<size; i++) {
		 arr[i]=sc1.nextInt();
		 }
		 return arr;
}
	 public static void pushZerosAtEnd(int[] arr) {
	    	//Your code goes here
	       int [] temp= new int[arr.length];
	       int i=0;
	       int j=0;
	       while(i<arr.length && j<temp.length){
	           if(arr[i]!=0){
	               temp[j]=arr[i];
	               System.out.print(temp[j] + " ");
	                
	             i++;
	             j++;
	              
	           }
	           else{
	               i++;
	           }
	           
	         
	          
	       }
	      
	 }
	
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 int arr1[]=takeInput(); 
	 pushZerosAtEnd(arr1);
	
	 
 }
}