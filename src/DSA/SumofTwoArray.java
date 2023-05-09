package DSA;
import java.util.Scanner;

class SumofTwoArray{
	public static void NoOfTestCase(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
        while(t!=0){
        	  int arr1[]=takeInput1();
              int arr2[]=takeInput2();
             int k=Math.max(arr1.length, arr2.length);
             int arr3[]=new int[k];
            sumOfTwoArrays(arr1,arr2,arr3);
             
            
        }
    }
	public static int[] takeInput1() {
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=sc.nextInt();
			
		}
		return arr1;
		
	}
	public static int[] takeInput2() {
		Scanner sc=new Scanner(System.in);
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=sc.nextInt();
			
		}
		return arr2;
		
	}
	
  public static int[] sumOfTwoArrays(int[] arr1, int[] arr2, int output[]){
	  int i=arr1.length-1;
	  int j=arr2.length-1;
	  int k=output.length-1;
	  int carry=0;
	  while(k>=0) {
		  int sum=0;
		  while (i>=0)	
			  sum+=arr1[i];
		  while(j>=0)
			  sum+=arr2[j];
		  sum+=carry;
		  carry=sum/10;
		  sum=sum%10;
		 output[k]=sum;
		
		 i--;
		 j--;
		 k--;
		 while(i>=0) {
			 sum=arr1[i]+carry;
			 carry=sum/10;
			 sum=sum%10;
		 }
		 while(i>=0) {
			 sum=arr2[j]+carry;
			 carry=sum/10;
			 sum=sum%10;
		 }
	  }
	
	  return output;
  }
  
	public static void main(String args[]) {
		NoOfTestCase();
	}
	
}