import java.util.Scanner;

public class RemoveCharsAndAdjacent {

    public String excludeHash(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '#') {
                // Remove left adjacent character (if exists and not already removed)
                if (i > 0 && result.length() > 0 ) { 
                     result.deleteCharAt(result.length() - 1);
                }


                // Skip the '#' character itself.
                
                 // Remove right adjacent (if exists)
                if (i < inputString.length() - 1) {
                    i++; // Skip the next character
                }

            } else {
                result.append(inputString.charAt(i));
            }
        }

        return result.toString();
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
