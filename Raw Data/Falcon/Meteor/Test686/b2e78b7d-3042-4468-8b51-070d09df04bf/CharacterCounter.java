import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char targetChar = scanner.nextLine().charAt(0);

        long startTime = System.nanoTime();
        int count = countOccurrences(inputString, targetChar);
        long endTime = System.nanoTime();

        System.out.println("Occurrences of '" + targetChar + "' in the string: " + count);

        displayExecutionTime(endTime - startTime);
        scanner.close();

    }


    private static int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    private static void displayExecutionTime(long timeInNanoseconds) {
        System.out.println("Execution time: " + timeInNanoseconds + " nanoseconds");
    }
}
