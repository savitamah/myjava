package fuctions;

public class incr {
	public static int increment(int n) {
		n=n+1;
		return n;
	}
	public static void main(String args[]) {
		int n=10;
	   increment(n);
		System.out.println(n);
	}

}
