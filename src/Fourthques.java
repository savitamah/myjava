
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Fourthques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the list (separated by spaces):");
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");

        List<Object> inputList = new ArrayList<>();

        for (String element : inputArray) {
            if (element.matches("-?\\d+")) {
                inputList.add(Integer.parseInt(element));
            } else {
                inputList.add(element.charAt(0));
            }
        }

        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Character> characters = new ArrayList<>();

        for (Object element : inputList) {
            if (element instanceof Integer) {
                int number = (int) element;
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                } else {
                    oddNumbers.add(number);
                }
            } else {
                characters.add((char) element);
            }
        }

        Collections.sort(oddNumbers);

        List<Integer> combinedNumbers = new ArrayList<>();
        combinedNumbers.addAll(oddNumbers);
        combinedNumbers.addAll(evenNumbers);

        StringBuilder palindrome = new StringBuilder();
        int oddIndex = 0;
        int evenIndex = combinedNumbers.size() - 1;

        while (oddIndex < oddNumbers.size() || evenIndex >= oddNumbers.size()) {
            if (oddIndex < oddNumbers.size()) {
                palindrome.append(characters.get(oddNumbers.get(oddIndex)));
                oddIndex++;
            }
            if (evenIndex >= oddNumbers.size()) {
                palindrome.append(characters.get(combinedNumbers.get(evenIndex)));
                evenIndex--;
            }
        }

        System.out.println("Palindrome string: " + palindrome.toString());
    }
}