package fuctions;
import java.util.Scanner;
public class fibN{

public static boolean checkMember(int n){
	
	/* Your class should be named Solution
	* Don't write main().
 	* Don't read input, it is passed as function argument.
 	* Return output and don't print it.
 	* Taking input and printing output is handled automatically.
	*/
    int n1=0;
    int n2=1;
    int n3;
   for(int i=0; i<=n; i++){
        n3=n1+n2;
        n1=n2;
        n2=n3;
        if(n==n2){
            return true;
        }
  

}
    return false;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    boolean checkm1=checkMember(num);
    System.out.println(checkm1);
}
}
