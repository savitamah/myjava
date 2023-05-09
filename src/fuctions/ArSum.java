package fuctions;
import java.util.Scanner;
public class ArSum {
	public static void  target() {
	Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t!=0) {
		int arr1[]=takeInput(); 
		 int sum2= sum(arr1);
		 System.out.println(sum2);
		 t--;
		 
	 }
	 System.out.println("Abc");
	 

	
	
	
	
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
  public static int sum(int input[]) {
		int sum1=0;
		for(int i=0; i<input.length; i++) {
			sum1=sum1+input[i];
		}
		return sum1;
	}
	public static void main(String args[]) {
		target();
	}
	
}
