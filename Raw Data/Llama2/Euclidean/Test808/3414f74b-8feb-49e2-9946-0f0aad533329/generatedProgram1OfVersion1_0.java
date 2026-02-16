import java.util.ArrayList;
import java.util.List;

public class LastNVowels {

    public static void main(String[] args) {
        String str1 = "aeiouaeiouaeiou";
        int n1 = 5;
        System.out.println("Original string: " + str1);
        System.out.println("Last " + n1 + " vowels: " + validate(str1, n1));

        String str2 = "programming";
        int n2 = 3;
        System.out.println("Original string: " + str2);
        System.out.println("Last " + n2 + " vowels: " + validate(str2, n2));

        String str3 = "hello world"; // Example with fewer vowels than n
        int n3 = 5;
        System.out.println("Original string: " + str3);
        System.out.println("Last " + n3 + " vowels: " + validate(str3, n3));
    }

    public static String validate(String str, int n) {
        List<Character> vowels = new ArrayList<>();

        // Iterate through the string from right to left to find vowels
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.add(ch);
                if (vowels.size() == n) {
                    break; // Stop when we've found n vowels
                }
            }
        }

        StringBuilder result = new StringBuilder();
        // Reverse the list to maintain original order within the last n
        for (int i = vowels.size() - 1; i >= 0; i--) {
            result.append(vowels.get(i));
        }

        return result.toString();
    }
}
