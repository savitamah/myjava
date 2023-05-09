import java.util.Scanner;
public class GreatestNumber {
	public int GreatestNumShow(int firstNum, int secondNum, int thirdNum) {
		if(firstNum>=secondNum && firstNum>thirdNum) {
			 return firstNum;
		 }
		 else if(secondNum>=thirdNum) {
			 return secondNum;
		 }
		 return thirdNum;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		int second=sc.nextInt();
		int third= sc.nextInt();
		GreatestNumber  ob=new  GreatestNumber();
		int n=ob.GreatestNumShow(first, second, third);
		System.out.print(n);
	}

}
