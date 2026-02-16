import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input strings.
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        // Create a new string that contains the characters from s1 that are not in s2.
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (!s2.contains(String.valueOf(c))) {
                result += c;
            }
        }

        // Print the result.
        System.out.println(result);
    }
}
