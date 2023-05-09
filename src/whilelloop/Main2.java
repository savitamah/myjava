package whilelloop;
import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {
        // Write your code here
    	int i=2;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i<n){
            if(n%i==0){
                System.out.print(i+" ");
            }
           
            i++;
        }
        
        
        
    }
}