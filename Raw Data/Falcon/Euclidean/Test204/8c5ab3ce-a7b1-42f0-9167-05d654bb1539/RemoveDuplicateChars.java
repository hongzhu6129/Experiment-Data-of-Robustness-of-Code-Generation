import java.util.*;

public class RemoveDuplicateChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Create a set to store the unique characters
        Set<Character> uniqueChars = new HashSet<>();

        // Iterate over the string and add each character to the set
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

        // Print the unique characters
        System.out.println(uniqueChars);
    }
}
