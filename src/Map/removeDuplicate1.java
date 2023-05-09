package Map;
import java.util.*;
class takeInput{
	public int[] takeInput() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++) {
		a[i]=sc.nextInt();
		}
		return a;
		
	}
	
}

public class removeDuplicate1 extends takeInput {
	  takeInput ob=new takeInput();
	   
      public static ArrayList<Integer> removeDuplicate(int a[]){
		ArrayList<Integer> output=new ArrayList<>();
		HashMap<Integer, Boolean> seen=new HashMap();
		for(int i=0; i<a.length; i++) {
			if(seen.containsKey(a[i])) {
				continue;
			}
			output.add(a[i]);
			seen.put(a[i], true);
		}
		return output;
		
		}
       public static void main(String args[]) { 
    	 
	    	}
    	  
      
	
	   
	    	
	    	
		
		
		
		
	}


