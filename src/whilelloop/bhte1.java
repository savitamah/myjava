package whilelloop;

import java.util.Scanner;
public class bhte1 {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=1;
        int n2=1;
        int n3;
        for(int i=1; i<=n-2; i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            

        }
        System.out.print(n2);
        
       
		
	}



	}


