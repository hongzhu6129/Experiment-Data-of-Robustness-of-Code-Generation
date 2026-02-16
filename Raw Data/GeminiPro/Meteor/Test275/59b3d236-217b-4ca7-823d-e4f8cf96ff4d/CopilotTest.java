import java.util.Scanner;

public class CopilotTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = convertToUppercase(input);
        System.out.println("Converted string: " + result);
    }

    public static String convertToUppercase(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}