
import java.util.*;

public class CalculateCost1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // total number of items
            int k = sc.nextInt(); // maximum distinct prices we can remember
            int c = sc.nextInt(); // cost of each price we can't remember
            Set<Integer> prices = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int price = sc.nextInt();
                prices.add(price);
            }
            int distinctPrices = prices.size();
            if (distinctPrices <= k) {
                System.out.println(0);
            } else {
                int extraPrices = distinctPrices - k;
                System.out.println(extraPrices * c);
            }
        }
    }
}