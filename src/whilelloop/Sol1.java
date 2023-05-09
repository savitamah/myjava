package whilelloop;

import java.util.Scanner;
public class Sol1 {
	
	public static void main(String[] args) {
		// Write your code here
      
        Scanner sc=new Scanner(System.in);
        int basic=sc.nextInt();
        String str=sc.next();
        char grade=str.charAt(0);
        int hra, da, pf, totalSalary;
        
        hra=(20/100)*basic;
        da=(50/100)*basic;
        pf=basic*(11/100);
        int allow;
         if (grade>= 'A' && grade <= 'Z')
         {
             if(grade=='A'){
                 allow=1700;
             }
             else if(grade=='B'){
                 allow=1500;  
                
             }
             else{
                 allow=1300;
                
             }
             totalSalary=basic+hra+da+allow-pf;
             
             System.out.print(totalSalary);
            
          
          
           
        
         }
       
        sc.close();
    
        
    
        
    
	}
}
