package fuctions;

import java.util.Scanner;
public class FtoC {

	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
	
        for(int  i=start; i<=end; i=i+step){
        	int c=(5*(i-32))/9;
            System.out.println(i+" "+c);
            
         }
    
		
	}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int start1=sc.nextInt();
        int end1=sc.nextInt();
        int step1=sc.nextInt();
        printFahrenheitTable(start1, end1, step1);
    }
}