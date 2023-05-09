
import java.util.Scanner;
public class ptc3 {
	public static void main(String[] args) {
		//Your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        
        while(i<=n){
        	char start=((char)('A'+ n-i));
            int j=1;
            while(j<=i){
                System.out.print(start);
                start++;
                j++;
                
  }
            System.out.println("");
            i++;
        }
        
	}
}