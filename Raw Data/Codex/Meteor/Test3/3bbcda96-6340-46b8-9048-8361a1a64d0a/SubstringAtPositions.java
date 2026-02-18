import java.util.Scanner;

public class SubstringAtPositions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the starting index of the first substring: ");
        int startIndex1 = scanner.nextInt();

        System.out.print("Enter the length of the substring: ");
        int substringLength = scanner.nextInt();

        System.out.print("Enter the starting index of the second substring: ");
        int startIndex2 = scanner.nextInt();


        if (startIndex1 >= 0 && startIndex1 + substringLength <= inputString.length() &&
                startIndex2 >= 0 && startIndex2 + substringLength <= inputString.length()) {

            String substring1 = inputString.substring(startIndex1, startIndex1 + substringLength);
            String substring2 = inputString.substring(startIndex2, startIndex2 + substringLength);

            if (substring1.equals(substring2)) {
                System.out.println("Same substring found at both positions: " + substring1);
            } else {
                System.out.println("Substrings are different.");
            }

        } else {
            System.out.println("Invalid input. Please check the indices and length.");
        }

        scanner.close();
    }
}
