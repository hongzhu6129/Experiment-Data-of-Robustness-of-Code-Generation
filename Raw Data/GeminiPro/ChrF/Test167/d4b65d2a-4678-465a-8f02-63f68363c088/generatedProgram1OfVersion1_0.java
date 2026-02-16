import java.util.*;

public class FindUniqueCharacter {

    public static void main(String[] args) {
        // Create a HashSet to store the unique characters
        Set<Character> uniqueChars = new HashSet<>();

        // Take input string from the user
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        // Iterate over each character in the input string
        for (char ch : inputString.toCharArray()) {
            // Add the character to the HashSet if it is not already present
            if (!uniqueChars.contains(ch)) {
                uniqueChars.add(ch);
            }
        }

        // Print the unique characters
        System.out.println("The unique characters in the string are: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
    }
}
