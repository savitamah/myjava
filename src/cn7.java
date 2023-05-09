import java.util.Scanner;
public class cn7 {
	
	    
	    public static void main(String[] args) {
	        // Write your code here
	    char ch;
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    ch=str.charAt(0);
	    
	        if (ch >= 'A' && ch <= 'Z')
	            System.out.println("\n" + ch +
	                    " is an UpperCase character");
	     
	        else if (ch >= 'a' && ch <= 'z')
	            System.out.println("\n" + ch +
	                    " is an LowerCase character" );
	     
	        else
	            System.out.println("\n" + ch +
	                    " is not an aplhabetic character" );
	        sc.close();
	    }
	 
	        


	}
