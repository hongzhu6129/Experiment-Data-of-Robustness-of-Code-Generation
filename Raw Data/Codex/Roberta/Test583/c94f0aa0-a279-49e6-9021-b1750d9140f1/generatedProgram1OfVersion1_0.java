import java.util.Scanner;

public class RemoveCharsAndAdjacent {

    public String excludeHash(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                // Remove left adjacent character if exists and within bounds
                if (i > 0) {
                    sb.deleteCharAt(sb.length() - 1); 
                }
                // Skip current '#' character
                // Skip right adjacent character if exists and within bounds
                if (i < str.length() - 1) {
                    i++;
                }
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        RemoveCharsAndAdjacent remover = new RemoveCharsAndAdjacent();
        String result = remover.excludeHash(inputString);

        System.out.println("Result: " + result);
        scanner.close();
    }
}
