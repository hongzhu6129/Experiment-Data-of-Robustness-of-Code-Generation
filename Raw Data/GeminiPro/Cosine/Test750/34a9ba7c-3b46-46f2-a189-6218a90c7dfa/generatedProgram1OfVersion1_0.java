import java.util.Scanner;

public class ReplaceVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the replacement character: ");
        char replacementChar = scanner.nextLine().charAt(0);

        String result = validate(inputString, replacementChar);
        System.out.println("Modified string: " + result);

        scanner.close();
    }

    public static String validate(String inputString, char replacementChar) {
        StringBuilder sb = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (isVowel(c)) {
                sb.append(replacementChar);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
