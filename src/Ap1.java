import java.io.*;
import java.util.*;
public class Ap1 
{
	public static int nthTerm(int input1, int input2, int input3) {
		int d1=input2-input1;
		int a=input1-d1;
		return (a + (input3-1)* d1);
			
		
	}
	public static void main(String args[]) {
		int input1=1;
		int input2=2;
		 int input3=4;
		 System.out.print(  nthTerm(input1, input2, input3));
		
		
	}
}