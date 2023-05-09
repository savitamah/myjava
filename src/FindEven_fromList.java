import java.util.*;
public class FindEven_fromList {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> num=new ArrayList<Integer>();
		System.out.print("How many number you want to find even or odd");
		int size=sc.nextInt();
		for(int i=0; i<size; i++) {
		num.add(sc.nextInt());
		
			
		}
		for(int value:num) {
			if(value%2==0) {
				System.out.print(value);
			}
		
			
		}
		
	}
}


