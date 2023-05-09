package Strings;
import java.util.Scanner;

public class CountWords{
	
   public static void countW(String str) {
   int count=0;
   for(int i=0; i<str.length(); i++ )
    {
	  
	  
      if((str.charAt(i)==' ' )|| (str.charAt(i) == '\t')||(str.charAt(i)=='\n')) {
    	  count=count+1;
    	  
      
      }
      
     
   }
   System.out.print(count);
   }
   
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	  String str1=sc.nextLine();
	 countW(str1);

	 
 }
}