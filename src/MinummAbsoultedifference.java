
import java.util.Arrays;
import java.util.Scanner;

public class MinummAbsoultedifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the array size from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Read the array elements from the user
        int[] arr = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the minimum absolute difference between any two elements
        Arrays.sort(arr); // sort the array in ascending order
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i+1]);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        // Print the result
        System.out.println( minDiff);
    }
}
