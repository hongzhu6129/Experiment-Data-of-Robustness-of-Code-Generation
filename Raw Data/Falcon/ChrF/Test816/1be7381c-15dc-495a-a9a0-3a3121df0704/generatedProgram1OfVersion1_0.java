import java.util.Arrays;

public class SecondNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "abbabcddd";
        System.out.println("Original String: " + str);
        char secondNonRepeatingChar = findSecondNonRepeatingCharacter(str);
        System.out.println("Second Non-Repeating Character: " + secondNonRepeatingChar);
    }

    public static char findSecondNonRepeatingCharacter(String str) {
        // Create an array to store the frequency of each character
        int[] charFrequency = new int[256];

        // Update the frequency of each character in the string
        for (char ch : str.toCharArray()) {
            charFrequency[ch]++;
        }

        // Iterate over the string again to find the second non-repeating character
        for (char ch : str.toCharArray()) {
            if (charFrequency[ch] == 2) {
                return ch;
            }
        }

        // Return a special character if no second non-repeating character is found
        return Character.MIN_VALUE;
    }
}
