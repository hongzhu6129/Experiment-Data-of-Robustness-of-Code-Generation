import java.util.Scanner;

public class CountCharacterOccurrences {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char targetChar = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                count++;
            }
        }

        System.out.println("Occurrences of '" + targetChar + "' in the string: " + count);

        long endTime = System.nanoTime();
        displayExecutionTime(endTime - startTime);
        scanner.close();

    }

    private static void displayExecutionTime(long timeElapsed) {
        System.out.println("Execution time: " + timeElapsed + " nanoseconds");
    }
}
