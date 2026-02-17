import java.util.Scanner;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();

        // Remove adjacent duplicates
       String result = removeAdjacentDuplicates(input); 

        // Print the result
        System.out.println("The string without adjacent duplicates is: " + result);
    }

    public static String removeAdjacentDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i] != chars[i - 1]) {
                sb.append(chars[i]);
            }
        }

        return sb.toString();
    }
}
