import java.util.Scanner;
public class findEven_fromArrya {
	public static void main(String args[]) {
		int i;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for( i=0; i<n; i++) {
		 arr[i]=sc.nextInt();
		
		}
		for( i=0; i<n; i++) {
		if(arr[i]%2==0) {
			System.out.print(arr[i]);
		}
		}
		
		
	}

}
